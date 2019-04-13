# how2s
Personal project of guides for software development




# Project Title

One Paragraph of project description goes here

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
Give examples
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc


But I have to admit, tasks lists are my favorite:

- [x] This is a complete item
- [ ] This is an incomplete item

There are many different ways to style code with GitHub's markdown. If you have inline code blocks, wrap them in backticks: `var example = true`.  If you've got a longer block of code, you can indent with four spaces:

    if (isAwesome){
      return true
    }

GitHub also supports something called code fencing, which allows for multiple lines without indentation:

```
if (isAwesome){
  return true
}
```

If you want to embed images, this is how you do it:

![Image of Yaktocat](https://octodex.github.com/images/yaktocat.png)


```javascript
function fancyAlert(arg) {
  if(arg) {
    $.facebox({div:'#foo'})
  }
}
```

    function fancyAlert(arg) {
      if(arg) {
        $.facebox({div:'#foo'})
      }
    }
    
- [x] @mentions, #refs, [links](), **formatting**, and <del>tags</del> supported
- [x] list syntax required (any unordered or ordered list supported)
- [x] this is a complete item
- [ ] this is an incomplete item


First Header | Second Header
------------ | -------------
Content from cell 1 | Content from cell 2
Content in the first column | Content in the second column

Any URL (like http://www.github.com/) will be automatically converted into a clickable link.

Strikethrough
Any word wrapped with two tildes (like ~~this~~) will appear crossed out.


[I'm an inline-style link](https://www.google.com)

[I'm an inline-style link with title](https://www.google.com "Google's Homepage")

[I'm a reference-style link][Arbitrary case-insensitive reference text]

[I'm a relative reference to a repository file](../blob/master/LICENSE)

[You can use numbers for reference-style link definitions][1]

Or leave it empty and use the [link text itself].

URLs and URLs in angle brackets will automatically get turned into links. 
http://www.example.com or <http://www.example.com> and sometimes 
example.com (but not on Github, for example).

Some text to show that the reference links can follow later.

[arbitrary case-insensitive reference text]: https://www.mozilla.org
[1]: http://slashdot.org
[link text itself]: http://www.reddit.com

# H1
## H2
### H3
#### H4
##### H5
###### H6

Alternatively, for H1 and H2, an underline-ish style:

Alt-H1
======

Alt-H2
------


**Hello** `world`.

```javascript
alert('Hello syntax highlighting.');
```

+
List item one continued with a second paragraph followed by an
Indented block.
+
.................
$ ls *.sh
$ mv *.sh ~/tmp
.................
+
List item continued with a third paragraph.

2. List item two continued with an open block.
+
--
This paragraph is part of the preceding list item.

a. This list is nested and does not require explicit item
continuation.
+
This paragraph is part of the preceding list item.

b. List item b.

This paragraph belongs to item two of the outer list.
--

# Hydeout

Hydeout updates the original [Hyde](https://github.com/poole/hyde)
theme for [Jekyll](http://jekyllrb.com) 3.x and adds new functionality.

![Desktop](/_screenshots/1.png?raw=true)
<img alt="Mobile home page" src="/_screenshots/2.png?raw=true" width="300px" />
<img alt="Mobile post page" src="/_screenshots/3.png?raw=true" width="300px" />

### Usage

Hydeout is available as the `jekyll-theme-hydeout` Ruby Gem.
Add `gem "jekyll-theme-hydeout", "~> 3.4"` to your Gemfile and run
`bundle install`.

If you're installing on Github pages, you may also have to add
`remote_theme: fongandrew/hydeout` to your `_config.yml`. [See the Github
instructions for more details.](https://help.github.com/articles/adding-a-jekyll-theme-to-your-github-pages-site/)

Hydeout uses pagination, so if you have an `index.md`, you'll need to swap
it with an `index.html` that uses the `index` layout:

```
---
layout: index
title: Home
---
```

You'll also need to add a setting to `_config.yml` telling Jekyll how many posts
to include per page (e.g. `paginate: 5`).

### Keep It Simple

In keeping with the original Hyde theme, Hydeout aims to keep the overall
design lightweight and plugin-free. JavaScript is currently limited only
to Disqus and Google Analytics (and is only loaded if you provide configuration
variables).

Hydeout makes heavy use of Flexbox in its CSS. If Flexbox is not available,
the CSS degrades into a single column layout.

### Customization

Hydeout replaces Hyde's class-based theming with the use
of the following SASS variables:

```scss
$sidebar-bg-color: #202020 !default;
$sidebar-fg-color: white !default;
$sidebar-sticky: true !default;
$layout-reverse: false !default;
$link-color: #268bd2 !default;
```

To override these variables, create your own `assets/css/main.scss` file.
Define your own variables, then import in Hydeout's SCSS, like so:

```scss
---
# Jekyll needs front matter for SCSS files
---

$sidebar-bg-color: #ac4142;
$link-color: #ac4142;
$sidebar-sticky: false;
@import "hydeout";
```

See the [_variables](_sass/hydeout/_variables.scss) file for other variables
you can override.

You can see the full set of partials you can replace in the
[`_includes`](_includes) folder, but there are a few worth noting:

* `_includes/copyright.html` - Insert your own copyright here.

* `_includes/custom-head.html` - Insert custom head tags (e.g. to load your
  own stylesheets)

* `_includes/custom-foot.html` - Insert custom elements at the end of the
  body (e.g. for custom JS)

* `_includes/custom-nav-links.html` - Additional nav links to insert at the
  end of the list of links in the sidebar.

  Pro-tip: The `nav`s in the sidebar are flexboxes. Use the `order` property
  to order your links.

* `_includes/custom-icon-links.html`- Additional icon links to insert at the
  end of the icon links at the bottom of the sidebar. You can use the `order`
  property to re-order.

* `_includes/favicons.html` - Replace references to `favicon.ico` and
  `favicon.png` with your own favicons references.

* `_includes/font-includes.html` - The Abril Fatface font used for the site
  title is loaded here. If you're overriding that font in the CSS, be sure
  to also remove the font load reference here.

### New Features

* Hydeout adds a new tags page (accessible in the sidebar). Just create a
  new page with the tags layout:

  ```
  ---
  layout: tags
  title: Tags
  ---
  ```

* Hydeout adds a new "category" layout for dedicated category pages.
  Category pages are automatically added to the sidebar. All other pages
  must have `sidebar_link: true` in their front matter to show up in
  the sidebar. To create a category page, use the `category` layout"

  ```
  ---
  layout: category
  title: My Category
  ---

  Description of "My Category"
  ```

* You can control how pages are sorted by using the `sidebar_sort_order`
  parameter in the front matter. This works for both category and non-category
  pages, although non-category pages will always come first. Take a look at
  [`_includes/sidebar-nav-links.html`](./_includes/sidebar-nav-links.html) if
  you want to customize this behavior.

  ```
  ---
  layout: page
  title: My page
  sidebar_sort_order: 123
  ---

  Some content.
  ```

* A simple redirect-to-Google search is available. Just create a page with
  the `search` layout.

  ```
  ---
  layout: search
  title: Google Search
  ---
  ```

* Disqus integration is ready out of the box. Just add the following to
  your config file:

  ```yaml
  disqus:
    shortname: my-disqus-shortname
  ```

  If you don't want Disqus or want to use something else, override
  `comments.html`.

* For Google Analytics support, define a `google_analytics` variable with
  your property ID in your config file.

There's also a bunch of minor tweaks and adjustments throughout the
theme. Hope this works for you!


# ice-box

> easy, one-off immutable directories!

[Pure functions](https://en.m.wikipedia.org/wiki/Pure_function) are a powerful concept. They allow you to, given an input,
produce the same deterministic output, *without side effects*.

On the filesystem, this is hard to achieve. Filesystems are all about side
effects! Consider creating a directory as a function, and then creating a file
within it:

```sh
$ mkdir foobar

$ touch foobar/quux
```

If this was part of a script you used in, say, a build process, you might run
into some problems:

1. your current directory is an implicit input; being in the wrong directory
   will have unintended side effects.
2. `mkdir foobar` is not
   [idempotent](https://en.wikipedia.org/wiki/Idempotence): multiple
   applications of it in the same directory yield different results (generally,
   an error).
3. it creates *global mutable state*. what if another not-quite-pure function
   decided it wanted to use `foobar/quux` for a different purpose? Each script
   can clobber and conflict with the other!
4. the resultant folder can be modified between functions. If I ran `mkdir foo;
   sleep 10; touch foo/quux` and, during those 10 seconds, another process did
   `rm -rf foo`, the result would be different than if they hadn't.

From this, we can say that a better solution would have the three inverse
properties:

1. the current directory should be irrelevant (that is, all paths should be
   absolute).
2. each application of a function should produce a brand new folder.
3. each brand new folder should be unique named, to prevent conflicts.
4. each brand new folder should have write permissions removed, so that its
   contents are frozen.

Enter **ice-box**: a module that manages a store of uniquely-named, immutable
directories, and makes it easy to create new ones.

## Usage

Let's say we have a build system that takes a directory and puts its contents
into a tarball. What might a script look like to do that, so we could invoke it
using `node make-tar.js some-directory/`?

```js
var icebox = require('ice-box')()
var fs = require('fs')
var path = require('path')
var tar = require('tar-fs')

var src = process.argv[2]

icebox(function (dst, done) {
  tar
    .pack(src)
    .pipe(fs.createWriteStream(path.join(dst, 'result.tar')))
    .on('finish', done)
}, function (err, finalDir) {
  console.log(finalDir)
})
```

Running `node make-tar.js some-directory/` will output

```
/home/sww/ice-box/8755ce4b-9ab0-c667-ea28-1f36bd0c8512
```

which contains the output file, `result.tar`.

## Pipelines

Much like UNIX pipes, this enables the creation of UNIX-like pipes: programs
that consume a directory can produce a new immutable directory and output that.

Imagine we had a program that took a directory of JS files and packaged them for
[Electron](http://electron.atom.io/) before the tarball step:

```js
var icebox = require('ice-box')('./ice-box')

var packager = require('electron-packager')

var src = process.argv[2]

icebox(function (dst, done) {
  packager({
    dir: src,  // use the input dir, 'src'
    arch: 'x64',
    platform: 'linux',
    out: dst,  // use the output dir, 'dst'
    tmpdir: false,
    prune: true,
    overwrite: true,
  }, done)
}, function (err, finalDir) {
  console.log(finalDir)
})
```

Now we could run this as just

```sh
$ node build-electron.js .

/home/sww/ice-box/8e3a47f8-f91d-a70b-692f-d0f54b730fb2
```

to get the electron-ready output, *or* it can be piped into `make-tar.js` from
the above section to produce the final `.tar` file!

```sh
$ node build-electron.js . | node make-tar.js

/home/sww/ice-box/a5339569-ae8f-4430-2dc1-a1a55340ea67
```

Now we have a directory with a tarball of the electron package!

*Bonus*: all intermediate steps are permanently cacheable, since they're
immutable and permanent!


## API

```js
var iceBox = require('ice-box')
```

### var icebox = iceBox([outDir], [tmpDir])

Creates a new function for adding new directories to an icebox. Both parameters
are optional, and default to sane values.

- `outDir` (string) - The location to place the immutable output directories.
  Defaults to `./ice-box`.
- `tmpDir` (string) - The temporary location to create in-progress directories
  that haven't yet finished being produced. These are cleaned up once they are
  frozen and placed in `outDir`.

### icebox(work, done)

Creates a new directory for writing to.

`work` is a function of the form `function (dir, done) { ... }`. `dir` is the
absolute path to the in-progress temporary directory. It has full write
permissions. `done` is a function to call once you are done writing, to signify
that the directory can be "frozen" and placed in the icebox. If you pass in an
error (`done(err)`) then the entire operation will abort cleanly.

`done` is a function of the form `function (dir) { ... }`. It is called once the
newly-frozen output directory is placed in the ice-box (`outDir` from the above
section). `path` is a string containing the absolute path to the frozen,
immutable, unique directory.


## Install

With [npm](https://npmjs.org/) installed, run

```
$ npm install ice-box
```

## Acknowledgments

I was inspired by looking at how many codebases will use a many-step build
process that involves transforming directories (source dir -> build dir ->
packaged dir -> windows installer program), but suffer from side effects and
shared global state. If build steps were interrupted the series of output
directories would be inconsistent, hard to track down, etc. I really wanted to
be able to make build and release pipelines that were as easy to reason about as
UNIX pipes.

## See Also

- [`noffle/common-readme`](https://github.com/noffle/common-readme)

## License

ISC




<a href="http://fvcproductions.com"><img src="https://avatars1.githubusercontent.com/u/4284691?v=3&s=200" title="FVCproductions" alt="FVCproductions"></a>

<!-- [![FVCproductions](https://avatars1.githubusercontent.com/u/4284691?v=3&s=200)](http://fvcproductions.com) -->

***INSERT GRAPHIC HERE (include hyperlink in image)***

# Repository Title Goes Here

> Subtitle or Short Description Goes Here

> ideally one sentence

> include terms/tags that can be searched

**Badges will go here**

- build status
- issues (waffle.io maybe)
- devDependencies
- npm package
- coverage
- slack
- downloads
- gitter chat
- license
- etc.

[![Build Status](http://img.shields.io/travis/badges/badgerbadgerbadger.svg?style=flat-square)](https://travis-ci.org/badges/badgerbadgerbadger) [![Dependency Status](http://img.shields.io/gemnasium/badges/badgerbadgerbadger.svg?style=flat-square)](https://gemnasium.com/badges/badgerbadgerbadger) [![Coverage Status](http://img.shields.io/coveralls/badges/badgerbadgerbadger.svg?style=flat-square)](https://coveralls.io/r/badges/badgerbadgerbadger) [![Code Climate](http://img.shields.io/codeclimate/github/badges/badgerbadgerbadger.svg?style=flat-square)](https://codeclimate.com/github/badges/badgerbadgerbadger) [![Github Issues](http://githubbadges.herokuapp.com/badges/badgerbadgerbadger/issues.svg?style=flat-square)](https://github.com/badges/badgerbadgerbadger/issues) [![Pending Pull-Requests](http://githubbadges.herokuapp.com/badges/badgerbadgerbadger/pulls.svg?style=flat-square)](https://github.com/badges/badgerbadgerbadger/pulls) [![Gem Version](http://img.shields.io/gem/v/badgerbadgerbadger.svg?style=flat-square)](https://rubygems.org/gems/badgerbadgerbadger) [![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org) [![Badges](http://img.shields.io/:badges-9/9-ff6799.svg?style=flat-square)](https://github.com/badges/badgerbadgerbadger)

- For more on these wonderful ~~badgers~~ badges, refer to <a href="http://badges.github.io/badgerbadgerbadger/" target="_blank">`badgerbadgerbadger`</a>.

***INSERT ANOTHER GRAPHIC HERE***

[![INSERT YOUR GRAPHIC HERE](http://i.imgur.com/dt8AUb6.png)]()

- Most people will glance at your `README`, *maybe* star it, and leave
- Ergo, people should understand instantly what your project is about based on your repo

> Tips

- HAVE WHITE SPACE
- MAKE IT PRETTY
- GIFS ARE REALLY COOL

> GIF Tools

- Use <a href="http://recordit.co/" target="_blank">**Recordit**</a> to create quicks screencasts of your desktop and export them as `GIF`s.
- For terminal sessions, there's <a href="https://github.com/chjj/ttystudio" target="_blank">**ttystudio**</a> which also supports exporting `GIF`s.

**Recordit**

![Recordit GIF](http://g.recordit.co/iLN6A0vSD8.gif)

**ttystudio**

![ttystudio GIF](https://raw.githubusercontent.com/chjj/ttystudio/master/img/example.gif)

---

## Table of Contents (Optional)

> If you're `README` has a lot of info, section headers might be nice.

- [Installation](#installation)
- [Features](#features)
- [Contributing](#contributing)
- [Team](#team)
- [FAQ](#faq)
- [Support](#support)
- [License](#license)


---

## Example (Optional)

```javascript
// code away!

let generateProject = project => {
  let code = [];
  for (let js = 0; js < project.length; js++) {
    code.push(js);
  }
};
```

---

## Installation

- All the `code` required to get started
- Images of what it should look like

### Clone

- Clone this repo to your local machine using `https://github.com/fvcproductions/SOMEREPO`

### Setup

- If you want more syntax highlighting, format your code like this:

> update and install this package first

```shell
$ brew update
$ brew install fvcproductions
```

> now install npm and bower packages

```shell
$ npm install
$ bower install
```

- For all the possible languages that support syntax highlithing on GitHub (which is basically all of them), refer <a href="https://github.com/github/linguist/blob/master/lib/linguist/languages.yml" target="_blank">here</a>.

---

## Features
## Usage (Optional)
## Documentation (Optional)
## Tests (Optional)

- Going into more detail on code and technologies used
- I utilized this nifty <a href="https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet" target="_blank">Markdown Cheatsheet</a> for this sample `README`.

---

## Contributing

> To get started...

### Step 1

- **Option 1**
    - 🍴 Fork this repo!

- **Option 2**
    - 👯 Clone this repo to your local machine using `https://github.com/joanaz/HireDot2.git`

### Step 2

- **HACK AWAY!** 🔨🔨🔨

### Step 3

- 🔃 Create a new pull request using <a href="https://github.com/joanaz/HireDot2/compare/" target="_blank">`https://github.com/joanaz/HireDot2/compare/`</a>.

---

## Team

> Or Contributors/People

| <a href="http://fvcproductions.com" target="_blank">**FVCproductions**</a> | <a href="http://fvcproductions.com" target="_blank">**FVCproductions**</a> | <a href="http://fvcproductions.com" target="_blank">**FVCproductions**</a> |
| :---: |:---:| :---:|
| [![FVCproductions](https://avatars1.githubusercontent.com/u/4284691?v=3&s=200)](http://fvcproductions.com)    | [![FVCproductions](https://avatars1.githubusercontent.com/u/4284691?v=3&s=200)](http://fvcproductions.com) | [![FVCproductions](https://avatars1.githubusercontent.com/u/4284691?v=3&s=200)](http://fvcproductions.com)  |
| <a href="http://github.com/fvcproductions" target="_blank">`github.com/fvcproductions`</a> | <a href="http://github.com/fvcproductions" target="_blank">`github.com/fvcproductions`</a> | <a href="http://github.com/fvcproductions" target="_blank">`github.com/fvcproductions`</a> |

- You can just grab their GitHub profile image URL
- You should probably resize their picture using `?s=200` at the end of the image URL.

---

## FAQ

- **How do I do *specifically* so and so?**
    - No problem! Just do this.

---

## Support

Reach out to me at one of the following places!

- Website at <a href="http://fvcproductions.com" target="_blank">`fvcproductions.com`</a>
- Twitter at <a href="http://twitter.com/fvcproductions" target="_blank">`@fvcproductions`</a>
- Insert more social links here.

---

## Donations (Optional)

- You could include a <a href="https://cdn.rawgit.com/gratipay/gratipay-badge/2.3.0/dist/gratipay.png" target="_blank">Gratipay</a> link as well.

[![Support via Gratipay](https://cdn.rawgit.com/gratipay/gratipay-badge/2.3.0/dist/gratipay.png)](https://gratipay.com/fvcproductions/)


---

## License

[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)

- **[MIT license](http://opensource.org/licenses/mit-license.php)**
- Copyright 2015 © <a href="http://fvcproductions.com" target="_blank">FVCproductions</a>.

