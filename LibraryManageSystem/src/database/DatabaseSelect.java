package database;

import javafx.collections.ObservableList;

public class DatabaseSelect {
    public static DatabaseConnect con = new DatabaseConnect();

    /**
     * 查询书籍，用字符串返回书籍信息，书籍中的每个信息之间用斜线“\"隔开
     * @param bname
     * @return
     */
    public static String selectBook(String bname) {}

    /**
     * 查询用户，用字符串返回用户信息，用户中的每个信息之间用斜线“\"隔开
     * @param uname
     * @return
     */
    public static String selectUser(String uname) {}

    /**
     * 查询借阅信息，通过uname查询到用户的uid，通过bname查询到用户的bid，再通过uid和bid查询借书信息，
     * 最后用字符串返回借阅信息，借阅信息中的每个信息之间用斜线“\"隔开
     * @param uname
     * @return
     */
    public static String selectBorrow(String uname, String bname) {}

    /**
     * 查询所有书籍信息，返回一个二维表
     * @return
     */
    public static ObservableList<ObservableList> selectAllBook() {}

    /**
     * 查询所有用户信息，返回一个二维表
     * @return
     */
    public static ObservableList<ObservableList> selectAllUser() {}

    /**
     * 获取所有借阅信息，返回一个二维表
     * @return
     */
    public static ObservableList<ObservableList> selectAllBorrow() {}
}
