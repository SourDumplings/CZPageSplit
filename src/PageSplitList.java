import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheng CHANG
 * @since 2019/5/29 13:42
 */
public class PageSplitList<T> {
    private List<T> data;
    private Integer pageSize;
    private Integer pageIndex;

    public PageSplitList(List<T> data, Integer pageSize, Integer pageIndex) {
        this.data = data;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }

    public PageSplitList(List<T> data, PageQuery pageQuery) {
        this(data, pageQuery.getPageSize(), pageQuery.getPageIndex());
    }

    public PageInfoMini<T> getResult() {
        List<T> resList = null; // 结果记录列表
        Integer size = data.size(); // 总记录数
        Integer pages = size / pageSize; // 总页数
        if (size - pages * pageSize > 0)
            ++pages;
        if (pageIndex < pages)
            resList = data.subList((pageIndex - 1) * pageSize, pageSize * pageIndex);
        else if (pageIndex == pages)
            resList = data.subList((pageIndex - 1) * pageSize, size);
        else
            resList = new ArrayList<T>();
        return new PageInfoMini<T>(resList, pageIndex, pageSize, resList.size(), size, pages);
    }
}
