package database;

public class DatabaseInsert {
    public static DatabaseConnect con = new DatabaseConnect();

    /**
     * 插入图书信息
     * @param bname
     * @param bclass
     * @param price
     * @param author
     * @param bstatus
     * @return
     */
    public static boolean insertBook(String bname, String bclass, double price, String author, String bstatus) {}

    /**
     * 插入用户信息
     * @param uname
     * @param password
     * @param uphone
     * @return
     */
    public static boolean insertUser(String uname, String password, String uphone) {}

    /**
     * 插入借阅信息
     * @param bid
     * @param uid
     * @param lentTime
     * @param backTime
     * @return
     */
    public static boolean insertRecord(String bid, String uid, String lentTime, String backTime) {}

}
