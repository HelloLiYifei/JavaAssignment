package database;

public class DatabaseUpdate {
    public static DatabaseConnect con = new DatabaseConnect();

    /**
     * 修改图书信息, 第一个参数为需要修改的图书编号，后面的参数依次为修改后的图书信息
     * @param oldbid
     * @param bname
     * @param bclass
     * @param price
     * @param author
     * @param bstatus
     * @return
     */
    public static boolean updateBook(int oldbid, String bname, String bclass, double price, String author, String bstatus) {}

    /**
     * 修改用户信息, 第1个参数为需要修改的用户编号，后面的参数依次为修改后的用户信息
     * @param uid
     * @param uname
     * @param password
     * @param uphone
     * @return
     */
    public static boolean updateUser(int uid, String uname, String password, String uphone) {}

    /**
     * 修改借阅信息, 第1个参数为需要修改的图书编号，第2个参数为需要修改的用户编号，第3个参数为修改后的借阅时间，第4个参数为修改后的还书时间
     * @param oldbid
     * @param olduid
     * @param oldborrowTime
     * @param bid
     * @param uid
     * @param lentTime
     * @param backTime
     * @return
     */
    public static boolean updateBorrow(int oldbid, int olduid, String oldborrowTime,int bid, int uid, String lentTime, String backTime) {}
}
