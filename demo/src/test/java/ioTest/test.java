package ioTest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Created by spdier on 2019-05-12.
 */
public class test {

    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("/Users/maozuowei/code/study_code/git/hello-world/demo/src/test/resources/test.txt");
            byte[] bytes = new byte[1024];
            int n = -1;
            //I/O 流式读取文件数据，同步阻塞，每次读取一个字节。
            while ((n = in.read(bytes, 0, bytes.length)) != -1) {
                String str = new String(bytes, 0, n, Charset.defaultCharset());
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
