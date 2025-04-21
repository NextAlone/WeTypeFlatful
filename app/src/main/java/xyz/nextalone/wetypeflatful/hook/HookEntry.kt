package xyz.nextalone.wetypeflatful.hook

import com.highcapable.yukihookapi.annotation.xposed.InjectYukiHookWithXposed
import com.highcapable.yukihookapi.hook.factory.configs
import com.highcapable.yukihookapi.hook.factory.encase
import com.highcapable.yukihookapi.hook.xposed.proxy.IYukiHookXposedInit

@InjectYukiHookWithXposed(isUsingResourcesHook = true, isUsingXposedModuleStatus = true)
class HookEntry : IYukiHookXposedInit {

    override fun onInit() = configs {
        debugLog {
            tag = "NextAloneHook"
            isEnable = true
        }
        isDebug = true
        isEnableModuleAppResourcesCache = true
        isEnableDataChannel = false
    }

    override fun onHook() = encase {
        // Your code here.
    }
}