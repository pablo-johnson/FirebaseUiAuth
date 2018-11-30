package cl.cutiko.space


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cl.cutiko.space.widgets.*

class CoordinatorFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = View(context)
        root.visibility = View.GONE
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity == null) return
        val welcomeView = activity!!.findViewById<WelcomeView>(R.id.welcomeTv)
        welcomeView.setCallback { scrollBackground() }
        welcomeView.welcomeUser()
    }

    private fun scrollBackground() {
        activity!!.findViewById<ScrollBackground>(R.id.scrollView).startScroll()
        activity!!.findViewById<OverlayView>(R.id.overlayV).fadIn { showLogin() }
    }

    private fun showLogin() {
        activity!!.findViewById<ExplosionView>(R.id.explosionV).explode()
        activity!!.findViewById<LoginButton>(R.id.helmetBtn).fadeIn()
    }

    override fun onResume() {
        super.onResume()
        activity?.findViewById<RootViewGroup>(R.id.rootVg)?.setImmersive()
    }

}