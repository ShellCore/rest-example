package rest

data class GitHubUserWrapper(val login : String, val url : String, val reposUrl : String, val name : String)

data class GitHubRepositoryInfo(val  name: String, val htmlUrl : String, val description : String?)

data class GitHubFollowerInfo(val login : String, val htmlUrl: String)