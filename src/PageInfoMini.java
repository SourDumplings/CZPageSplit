import java.util.List;

/**
 * @author Zheng CHANG
 * @since 2019/5/29 14:53
 */
public class PageInfoMini<T> {
    //当前页
    private int pageIndex;
    //每页的数量
    private int pageSize;
    //当前页的数量
    private int thisSize;
    // 总记录数
    private int totalSize;
    //总页数
    private int pageNum;
    // 数据
    private List<T> list;

    public PageInfoMini() {
        this.pageIndex = 0;
        this.pageSize = 0;
        this.thisSize = 0;
        this.totalSize = 0;
        this.pageNum = 0;
        this.list = null;
    }

    public PageInfoMini(List<T> list, int pageIndex, int pageSize, int thisSize, int totalSize, int pageNum) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.thisSize = thisSize;
        this.totalSize = totalSize;
        this.pageNum = pageNum;
        this.list = list;
    }
}
