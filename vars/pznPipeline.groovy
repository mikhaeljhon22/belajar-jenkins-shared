def call(Map config){
    if(connfig.type == "maven"){
        mavenPipeline()
    }else{
        println("Pipeline type not supportedg")
    }
}