package vn.edu.taipp.projectfinalexam.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vn.edu.taipp.projectfinalexam.model_dto.Identifiable;

public class APIDataCache {

    private static APIDataCache instance;

    // Lưu trữ cache, mỗi String (tên bảng) ánh xạ đến một danh sách các đối tượng thực thi Identifiable
    private final Map<String, List<Identifiable>> cache = new HashMap<>();

    // Lấy instance của APIDataCache
    public static APIDataCache getInstance() {
        if (instance == null) {
            instance = new APIDataCache();
        }
        return instance;
    }

    // Lưu danh sách vào cache
    public <T extends Identifiable> void addListToCache(String tableName, List<T> newList) {
        cache.put(tableName, new ArrayList<>(newList));
    }

    // Phương thức cập nhật đối tượng trong cache
    public <T extends Identifiable> void updateInCache(String tableName, T updatedItem) {
        // Lấy danh sách từ cache dựa trên tableName
        List<T> list = (List<T>) cache.get(tableName);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                T item = list.get(i);
                if (item.getId() == updatedItem.getId()) {
                    list.set(i, updatedItem); // Cập nhật đối tượng nếu ID trùng khớp
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Table not found: " + tableName);
        }
    }

    // Phương thức xóa đối tượng trong cache theo ID
    public <T extends Identifiable> void deleteInCache(String tableName, T itemToDelete) {
        List<T> list = (List<T>) cache.get(tableName);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                T item = list.get(i);
                if (item.getId() == itemToDelete.getId()) {
                    list.remove(i); // Xóa đối tượng nếu ID trùng khớp
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Table not found: " + tableName);
        }
    }

    // Hàm lấy danh sách từ cache theo tên bảng và kiểu của đối tượng
    public <T extends Identifiable> List<T> getListFromCache(String tableName, Class<T> type) {
        List<Identifiable> list = cache.get(tableName);
        if (list != null) {
            // Tạo danh sách List của kiểu T
            List<T> typedList = new ArrayList<>();
            for (Identifiable item : list) {
                if (type.isInstance(item)) {
                    typedList.add(type.cast(item)); // Ép kiểu an toàn
                }
            }
            return typedList;
        }
        return new ArrayList<>(); // Trả về danh sách rỗng nếu không tìm thấy
    }
}
