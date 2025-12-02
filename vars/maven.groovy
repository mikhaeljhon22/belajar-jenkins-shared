def call(List command){
    for(command in commands){
        sh "mvn ${command}"
    }
g}