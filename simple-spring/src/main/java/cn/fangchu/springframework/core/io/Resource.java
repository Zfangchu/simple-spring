package cn.fangchu.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/****
 * 提供获取 InputStream 流的方法
 *
 * @author Fangchu
 * @date 2021/11/8
 **/
public interface Resource {

    InputStream getInputStream() throws IOException;
}
