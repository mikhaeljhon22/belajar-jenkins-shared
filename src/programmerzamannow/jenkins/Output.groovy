package programmerzamannow.jenkins

class Output {
    static def hello(script, String name){
        script.echo("Hello ${name}")
    }
}