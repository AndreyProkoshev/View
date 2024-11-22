package ru.netology.nmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.netology.nmedia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val post = Post(
            id = 1,
            author = "Нетология. Университет интернет-профессий будущего",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
            published = "21 мая в 18:36",
            AccountLike = 0,
            rty = 0,
            textview = 0,
            repostByMe = false,
            viewByMe = false,
            repost = 9999,
            countLike = 9999,
            countview = 9999,
            likedByMe = false)
        with(binding) {
            author.text = post.author
            published.text = post.published
            content.text = post.content
            AccountLike.text = formatNumber(post.countLike)
            rty.text = formatNumber(post.repost)
            textview.text = formatNumber(post.countview)
            root.setOnClickListener {
                Log.d("ProkoshevAY", "root")
            }
            avatar.setOnClickListener {
                Log.d("ProkoshevAY", "avatar")
            }
            like.setOnClickListener {
                    Log.d("ProkoshevAY", "Like")
                post.likedByMe = !post.likedByMe
                if (post.likedByMe) {
                    like.setImageResource(R.drawable.ic_liked_24)
                    post.countLike++
                } else {
                    like.setImageResource(R.drawable.ic_like_24)
                    post.countLike--
                }
                AccountLike.text = formatNumber(post.countLike)
            }
            lin.setOnClickListener {
                post.repostByMe = !post.repostByMe
                post.repost++
                rty.text = formatNumber(post.repost)
            }
            view.setOnClickListener {
                post.viewByMe = !post.viewByMe
                post.countview++
                textview.text = formatNumber(post.countview)
            }
        }
    }
}
