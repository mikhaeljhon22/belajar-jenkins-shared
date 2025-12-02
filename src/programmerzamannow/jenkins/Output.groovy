package programmerzamannow.jenkins

class Output {
    static def hello(String name){
        steps.echo("Hello ${name}")
    }
}