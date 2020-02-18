# ipserver
DESCRIPTION = "Basic text server over TCP/IP"
HOMEPAGE = "https://github.com/brymatPC/goSnippets"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=935a1b6dff47d5ccf85da95eb86afa23"

INHIBIT_PACKAGE_STRIP="1"

GO_IMPORT = "ipserver"

PTEST_ENABLED="0"
GO_LINKSHARED = ""
GO_LDFLAGS = '-ldflags="${GO_RPATH} ${GO_LINKMODE} -X main.compileDate=`date -u +%Y%m%d.%H%M%S` -X main.gitHash=`git -C src/ rev-parse --verify HEAD` -extldflags '${GO_EXTLDFLAGS}'"'

SRC_URI = "\
	git://git@github.com/brymatPC/goSnippets.git;protocol=ssh;name=snippets;destsuffix=${PN}-${PV} \
	"

SRCREV_snippets = "${AUTOREV}"

inherit go

do_compile_prepend () {
	export GOCACHE="${B}/.cache"
}