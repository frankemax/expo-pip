import ExpoModulesCore

public class ExpoPipModule: Module {
  public func definition() -> ModuleDefinition {
    Name("ExpoPip")

     Function("getTheme") { () -> String in
      "system"
    }
  }
}
