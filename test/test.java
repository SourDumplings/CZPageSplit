import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sourd
 * @since 2019/6/10 15:33
 */
public class test {
    @Test
    public void testPageSplit() throws IOException {
        File f = new File("testData");
        FileReader fileReader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = null;
        List<Integer> list = new ArrayList<Integer>();
        while ((str = bufferedReader.readLine()) != null)
            list.add(Integer.parseInt(str));
        PageQuery pageQuery = new PageQuery(6, 2);
        PageSplitList<Integer> pageSplitList = new PageSplitList<Integer>(list, pageQuery);
        PageInfoMini pageInfoMini = pageSplitList.getResult();
        return;
    }
}
