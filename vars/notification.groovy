import org.ggp.Notifiation

def notification = new Notifiation(this)

node {
    notification.send()
}
