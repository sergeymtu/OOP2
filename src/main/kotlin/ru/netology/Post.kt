package ru.netology

data class Post(

    val id: Int,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = " ",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Int = 0,
    val comments: Boolean = false,
    val copyright: Boolean = false,
    val likes: Boolean = false,
    val reposts: Boolean = false,
    val views: Boolean = false,
    val postType: String = " ",
    val signerId: Int = 0,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Boolean = false,
    val postponedId: Int = 0,

    )