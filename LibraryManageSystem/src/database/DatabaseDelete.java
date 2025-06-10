package database;

public class DatabaseDelete {
    public static DatabaseConnect con = new DatabaseConnect();
    /**
     * 删除图书 成功返回true 失败返回false
     * @param bid
     * @return
     */
    public static boolean deleteBook(int bid) {}

    /**
     * 删除用户 成功返回true 否则返回false
     * @param uid
     * @return
     */
    public static boolean deleteUser(int uid) {}

    /**
     * 删除借阅记录 成功返回true 否则返回false
     * @param bid
     * @param uid
     * @param lentTime
     * @return
     */
    public static boolean deleteBorrow(int bid, int uid, String lentTime) {}
}
