package sri.universal

import scala.scalajs.js

@js.native
trait ReactEvent[T <: js.Object] extends js.Object {

  val nativeEvent: T = js.native
}

@js.native
trait TextInputEvent extends js.Object {

  val text: String = js.native

  val contentSize: TextInputContentSize = js.native
}

@js.native
trait TextInputContentSize extends js.Object {

  val width: Double = js.native

  val height: Double = js.native
}

@js.native
trait ImageEvent extends js.Object {

}


@js.native
trait SyntheticEvent extends js.Object {

}

