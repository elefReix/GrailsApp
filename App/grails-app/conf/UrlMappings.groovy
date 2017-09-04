class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?"{
            constraints {
                // apply constraints here
            }
        }
		"/test/greeting"(view:"/greeting")
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
