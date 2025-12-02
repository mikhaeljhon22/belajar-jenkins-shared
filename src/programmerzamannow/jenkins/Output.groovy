package programmerzamannow.jenkins

class Output {
    static def hello(String name){
        script.echo("Hello ${name}")
    }
}