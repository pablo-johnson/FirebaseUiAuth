package cl.cutiko.dance

class PermissionFragment : IntroFragment() {

    companion object {
        fun newInstance() : PermissionFragment {
            return PermissionFragment()
        }
    }

    override val getText: Int
        get() = R.string.intro_permissions
    override val getUndraw: Int
        get() = R.drawable.undraw_android
}