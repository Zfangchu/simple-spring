package cn.fangchu.springframework.beans;

/****
 *
 *
 * @author Fangchu
 * @date 2021/10/16
 **/
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
