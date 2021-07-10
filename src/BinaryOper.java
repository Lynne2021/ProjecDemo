/**
 * A Binary Class to read and write Binary files in java.ca
 *
 * @author HongLin, XiaoMingSu
 * @version 1.0
 * @since 2021-07-10
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

    public class BinaryOper {
        /**
         * @param args
         * @throws FileNotFoundException
         * @throws IOException
         * @throws ClassNotFoundException
         */
        public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

            TimeStamp timeStamp = new TimeStamp(1234,"21:03:21");
            FileOutputStream fos = new FileOutputStream("temp.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(timeStamp);
            oos.close();

            FileInputStream fstream =new FileInputStream("temp.data");
            ObjectInputStream ostream = new ObjectInputStream(fstream);
            TimeStamp outputStamp = (TimeStamp)ostream.readObject();
            System.out.println(outputStamp.toString());
            fstream.close();
        }

    }

