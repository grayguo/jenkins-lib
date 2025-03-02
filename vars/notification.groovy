import org.ggp.Notification

def notification = new Notification(this)

node {
    notification.send()
}
