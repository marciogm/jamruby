jamruby
====

__jamruby__ is Java to mruby bridge.

Ready to build
----

    $ git clone https://github.com/mruby/mruby.git
    $ git clone https://github.com/crimsonwoods/jamruby.git
    $ cd mruby
    $ git clone https://github.com/crimsonwoods/mruby_ndk-build.git android
    $ make
    $ cd android/jni
    $ ndk-build
    $ cd ../../../jamruby

'mruby' is needed for build 'jamruby'.<br/>
And it has to place on same directory.<br/>
if your environment is not, you have to modify your makefile 'Android.mk'.

How to build the JNI library
----

    $ cd jni
    $ ndk-build

Open project via Eclipse
----

1. import project; select 'Existing Projects into Workspace' on the import wizard.
2. select root directory (cloned directory 'jamruby').
3. build project.
4. 'jamruby' is built as Android library project.

License
----

__MIT License__

Copyright (c) 2012 jamruby developers

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

