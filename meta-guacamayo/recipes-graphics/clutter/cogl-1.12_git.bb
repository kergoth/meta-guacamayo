require cogl-1.12.inc
require cogl-1.12-git.inc

PR = "${INCPR}.0"

# the 'normal' config: big gl over X11
DEPENDS             = "${STDDEPENDS} ${STDDEPENDS_X11} ${STDDEPENDS_GL}"
DEPENDS_beagleboard = "${STDDEPENDS} ${STDDEPENDS_X11} ${STDDEPENDS_EGL}"
DEPENDS_raspberrypi = "${STDDEPENDS} ${STDDEPENDS_X11} ${STDDEPENDS_EGL}"
DEPENDS_pandaboard  = "${STDDEPENDS} ${STDDEPENDS_X11} ${STDDEPENDS_EGL}"

RDEPENDS             += "${STDRDEPENDS} ${STDRDEPENDS_GL}"
RDEPENDS_beagleboard += "${STDRDEPENDS} ${STDRDEPENDS_GLES2}"
RDEPENDS_raspberrypi += "${STDRDEPENDS} ${STDRDEPENDS_GLES2}"
RDEPENDS_pandaboard  += "${STDRDEPENDS} ${STDRDEPENDS_GLES2}"

DEFAULT_PREFERENCE = "1"

EXTRA_OECONF             = "${BASE_CONF} ${BASE_CONF_X11_GL}"
EXTRA_OECONF_beagleboard = "${BASE_CONF} ${BASE_CONF_X11_GLES}"
EXTRA_OECONF_raspberrypi = "${BASE_CONF} ${BASE_CONF_X11_GLES}"
EXTRA_OECONF_pandaboard  = "${BASE_CONF} ${BASE_CONF_X11_GLES}"
