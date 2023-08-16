# Question-App-Spring-Boot-MySQL-and-React

Status: In Progress

Users should be able to sign up

Users should be able to log in

Users should be able to post

Users should be able to comment on a post

Users should be able to like a post

System should push notifications

Entity: 

user

post

like

comment

Controller : 

./users

./users/{userId}

./users/{userId}/profile

./post

./post?user={userId}

./post/{postId}

./comments

./comments?postId={postId}

./comments?user={userId}

./comments/{commentId}

./likes

./likes?postId={postId}

./likes?user={userId}

./likes/{likeId}

-security jwt

