package com.sksamuel.hoplite

import com.sksamuel.hoplite.readers.Reader
import io.kotlintest.specs.WordSpec

class TReaderTest : WordSpec({
  "Derived reader for T" should {
    "return error for non data classes" {
      Reader.forT<Thread>()
    }
  }
})