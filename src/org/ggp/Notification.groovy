package org.ggp

class Notification implements Serializable {

    def steps

    Notification (steps) {
        this.steps = steps
    }

    def send() {
        steps.sh "cat /etc/os-release"
        steps.env.each { k, v ->
            println "${k} = ${v}"
        }
    }

}

/*
def send () {
  sh "uname -a"
}

return this
*/
