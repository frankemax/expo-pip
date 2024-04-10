package expo.modules.pip

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ExpoPipModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("ExpoPip")

    Function("getTheme") {
      return@Function "system"
    }
  }
}
