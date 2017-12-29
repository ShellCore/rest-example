package rest

data class BasicObjectInfoDO(val login : String, val url : String, val reposUrl : String, val name : String)

data class GitHubRepositoryDO(val name: String, val htmlUrl : String, val description : String?)

data class GitHubFollowerInfoDO(val login : String, val htmlUrl: String)