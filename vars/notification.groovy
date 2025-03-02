import org.ggp.Notification

def call() {
    def n = new Notification(this)
    n.send()
}
