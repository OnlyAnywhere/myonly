package designpattern.observer;

import designpattern.observer.impl.Police;
import designpattern.observer.impl.Security;
import designpattern.observer.impl.Thief;
import designpattern.observer.impl.Transporter;

/**
 * Created by chenjunjun on 16/1/15 09:48
 */
public class Test {
    public static void main(String[] args)
    {
        Transporter transporter = new Transporter();

        Police police = new Police();
        Security security = new Security();
        Thief thief = new Thief();

        transporter.addWatcher(police);
        transporter.addWatcher(security);
        transporter.addWatcher(thief);

        transporter.notifyWatchers();
    }
}
