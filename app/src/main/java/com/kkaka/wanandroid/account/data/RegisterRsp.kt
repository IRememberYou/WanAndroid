package com.kkaka.wanandroid.account.data

/**
 * author：  HyZhan
 * created： 2018/10/30 16:31
 * desc：    TODO
 */
data class RegisterRsp(
        var username: String,
        var id: Int,
        var icon: String,
        var type: Int,
        var collectIds: List<Int>
)