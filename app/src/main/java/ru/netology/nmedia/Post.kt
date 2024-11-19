package ru.netology.nmedia

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    var likedByMe: Boolean,
    var viewByMe: Boolean,
    var repostByMe: Boolean,
    var repost:Int,
    var countLike: Int,
    var countview: Int,
    val AccountLike: Long,
    val rty: Long,
    val textview: Long
)