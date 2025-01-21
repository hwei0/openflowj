COMPILE_DEPS =  [
    "@slf4j_api//jar",
    "@com_google_guava_guava_290-jre//jar",
    "@com_google_code_findbugs_annotations_301u2//jar",
    "@junit//jar",
    "@hamcrest_all//jar",
    "@io_netty_netty-all_4150Final//jar",
    "@ch_qos_logback_logback-core_123//jar",
    "@ch_qos_logback_logback-classic_123//jar"
]

osgi_jar_with_tests(
    name="onos-openflowj",
    deps = COMPILE_DEPS,
    test_deps = TEST,
    srcs = glob(['src/**/*.java']),
    visibility = ["//visibility:public"]
)
