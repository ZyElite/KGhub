package com.zyelite.kghub.fragment.base

import android.os.Bundle
import android.support.v4.app.Fragment
import io.realm.Realm

/**
 * @author zy
 * @date 2018/3/16
 * @des BaseFragment
 */
open class BaseFragment : Fragment() {
    open var title = ""
    var realm = Realm.getDefaultInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}