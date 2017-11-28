package contentScripts

import extensionTypes.RunAt
import kotlin.Any
import kotlin.js.Promise

typealias ExtensionFileOrCode = Any

/**
 * Details of a content script registered programmatically
 */
external class RegisteredContentScriptOptions {
  val matches: Array<manifest.MatchPattern>

  val excludeMatches: Array<manifest.MatchPattern>?

  val includeGlobs: Array<String>?

  val excludeGlobs: Array<String>?

  /**
   * The list of CSS files to inject
   */
  val css: Array<ExtensionFileOrCode>?

  /**
   * The list of JS files to inject
   */
  val js: Array<ExtensionFileOrCode>?

  /**
   * If allFrames is <code>true</code>, implies that the JavaScript or CSS should be injected into all frames of current page. By default, it's <code>false</code> and is only injected into the top frame.
   */
  val allFrames: Boolean?

  /**
   * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is <code>false</code>.
   */
  val matchAboutBlank: Boolean?

  /**
   * The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle".
   */
  val runAt: RunAt
}

typealias RegisteredContentScript = Any

external class ContentScripts {
  /**
   * Register a content script programmatically
   */
  fun register(contentScriptOptions: RegisteredContentScriptOptions): Promise<Any>
}
