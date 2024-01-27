package com.example.instarecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    private lateinit var storyPageAdapter: StoryPageAdapter
    private lateinit var feedPageAdapter: FeedPageAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Find the RecyclerView in the layout
        val storyView = view.findViewById<RecyclerView>(R.id.storyView)
        val feedView = view.findViewById<RecyclerView>(R.id.feedView)

        // Create a list of StoryPost objects
        val storyPostList = listOf(
            StoryPost(ids = "addyyyyyx", img = R.drawable.p4),
            StoryPost(ids = "octanee", img = R.drawable.p2),
            StoryPost(ids = "jalaj", img = R.drawable.p3),
            StoryPost(ids = "addyyyyyx", img = R.drawable.p1),
            StoryPost(ids = "octanee", img = R.drawable.p2),
            StoryPost(ids = "jalaj", img = R.drawable.p3),
            StoryPost(ids = "addyyyyyx", img = R.drawable.p1),
            StoryPost(ids = "octanee", img = R.drawable.p2),
            StoryPost(ids = "jalaj", img = R.drawable.p3),
            StoryPost(ids = "addyyyyyx", img = R.drawable.p1),
            StoryPost(ids = "octanee", img = R.drawable.p2),
            StoryPost(ids = "jalaj", img = R.drawable.p3),

        )

        val feedPostList = listOf(
            FeedPost(dpImg = R.drawable.p, userId = "addyyyyyx" , feedImg = R.drawable.p2,
                likeImg1 = R.drawable.p2, likeImg2 = R.drawable.p2, likedById = "abbhy" ,
                caption = "First post" , oneComment = "hello!" , oneCommentId = "abhhy",
                totalComment = "15" , postDate = "15 November 23", totalLikes = 700
                ),
            FeedPost(dpImg = R.drawable.p4, userId = "addyyyyyx" , feedImg = R.drawable.p1,
                likeImg1 = R.drawable.p2, likeImg2 = R.drawable.p2, likedById = "abbhy" ,
                caption = "First post" , oneComment = "hello!" , oneCommentId = "abhhy",
                totalComment = "15" , postDate = "15 November 23", totalLikes = 700
            ),
            FeedPost(dpImg = R.drawable.p2, userId = "addyyyyyx" , feedImg = R.drawable.p,
                likeImg1 = R.drawable.p2, likeImg2 = R.drawable.p2, likedById = "abbhy" ,
                caption = "First post" , oneComment = "hello!" , oneCommentId = "abhhy",
                totalComment = "15" , postDate = "15 November 23", totalLikes = 700
            ),
            FeedPost(dpImg = R.drawable.p5, userId = "addyyyyyx" , feedImg = R.drawable.p3,
                likeImg1 = R.drawable.p2, likeImg2 = R.drawable.p2, likedById = "abbhy" ,
                caption = "First post" , oneComment = "hello!" , oneCommentId = "abhhy",
                totalComment = "15" , postDate = "15 November 23", totalLikes = 700
            ),
        )


// Create a StoryPageAdapter with the list of StoryPost objects
        storyPageAdapter = StoryPageAdapter(storyPostList)

// Set the adapter to the RecyclerView

        storyView.adapter = storyPageAdapter

// Optionally, set a layout manager (e.g., LinearLayoutManager)
        val layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        storyView.layoutManager = layoutManager

//        val feedPostList = listOf(
//            FeedPost(
//                dpImg = R.drawable.p,
//                userId = "addyyyyyx",
//                feedImg = R.drawable.p2,
//                likeImg1 = R.drawable.p2,
//                likeImg2 = R.drawable.p2,
//                likedById = "abbhy",
//                caption = "First post",
//                oneComment = "hello!",
//                oneCommentId = "abhhy",
//                totalComment = "15",
//                postDate = "15 November 23",
//                totalLikes = 334
//            ),
//            // ... (your FeedPost objects)
//            FeedPost(
//                dpImg = R.drawable.p2,
//                userId = "addyyyyyx",
//                feedImg = R.drawable.p,
//                likeImg1 = R.drawable.p3,
//                likeImg2 = R.drawable.p4,
//                likedById = "abbhy",
//                caption = "Second post",
//                oneComment = "hello!",
//                oneCommentId = "abhhy",
//                totalComment = "15",
//                postDate = "15 November 23",
//                totalLikes = 66334
//            ),
//        )

        feedPageAdapter = FeedPageAdapter(feedPostList)

        // Set the adapter to the Feed RecyclerView
        feedView.adapter = feedPageAdapter

        // Optionally, set a layout manager for the Feed RecyclerView (e.g., LinearLayoutManager)
        val feedLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        feedView.layoutManager = feedLayoutManager

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                HomeFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}