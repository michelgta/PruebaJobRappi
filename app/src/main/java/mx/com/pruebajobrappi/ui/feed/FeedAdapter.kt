package mx.com.pruebajobrappi.ui.feed

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import mx.com.pruebajobrappi.ui.favorite.FavoriteFragment
import mx.com.pruebajobrappi.ui.popular.PopularFragment
import mx.com.pruebajobrappi.utils.Constants

class FeedTabsAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            Constants.TAB_1 -> PopularFragment()
            Constants.TAB_2 -> FavoriteFragment()
            else -> PopularFragment()
        }

    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }


}