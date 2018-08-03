## 安装 Nodejs

```
curl --silent --location https://rpm.nodesource.com/setup_8.x | sudo bash - && \
yum -y install nodejs
```

## 启动这 3 个工程

### 启动 h-springcloud-sidecar-nodejs 工程

```
cd h-springcloud-sidecar-nodejs
npm i
npm start
```

浏览器打开 http://localhost:3000 看到下面的页面表示成功启动

```
Express

Welcome to Express
```

### 启动 h-springcloud-sidecar-service 工程

按照 spring boot 工程的启动方式启动，导入到 eclipse 启动也可以

### 启动 h-springcloud-sidecar-web 工程

按照 spring boot 工程的启动方式启动，导入到 eclipse 启动也可以

## 最后结果

浏览器打开 http://localhost:9091/sidecar/server/test 返回下面结果表示成功

```
users data from nodejs server
```
