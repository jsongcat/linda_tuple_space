import java.io.Serializable;

/**
 * Created by jasonzhang on 4/9/17.
 */
public class NetsEntry implements Serializable {
    int hostId;
    String hostName;
    String ipAddr;
    int portNum;
}