const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyuanqiuzhizhaopinxitong/",
            name: "xiaoyuanqiuzhizhaopinxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyuanqiuzhizhaopinxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园求职招聘系统"
        } 
    }
}
export default base
