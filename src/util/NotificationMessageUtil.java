package util;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @Since : 2021-09-20
 **/
public class NotificationMessageUtil {

    public void successMessage(String text) {
        Image image = new Image(("/assests/images/pass.png"));
        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text(text);
        notifications.title("Confirmation Massage");
        notifications.hideAfter(Duration.seconds(2));
        notifications.position(Pos.TOP_CENTER);
        notifications.darkStyle();
        notifications.show();
    }

    public void errorMessage(String text) {
        Image image = new Image(("/assests/images/fail.png"));
        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text(text);
        notifications.title("Error Massage");
        notifications.hideAfter(Duration.seconds(2));
        notifications.position(Pos.TOP_CENTER);
        notifications.darkStyle();
        notifications.show();
    }

    public void infoMessage(String text) {
        Image image = new Image(("/assests/images/info.png"));
        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text(text);
        notifications.title("Information Massage");
        notifications.hideAfter(Duration.seconds(2));
        notifications.position(Pos.TOP_CENTER);
        notifications.darkStyle();
        notifications.show();
    }
}
