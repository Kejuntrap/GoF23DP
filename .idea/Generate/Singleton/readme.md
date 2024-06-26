# Singleton

## about

単一原則の責任をなげうって、余りあるメリットを享受したデザインパターン。

クラスのインスタンスが１つであることを保証し、それにより、そのインスタンス自身以外のことについてあまり考えなくてよくなる。

インスタンスが１つしかないことで、DBやネットワークの共有資源の制御ができる。そしてその管理がしやすくなる。

ほかのオブジェクトがシングルトンのクラスnewを使用しないようにデフォルトでコンストラクタをprivateにする。

コンストラクタとして機能するstaticな作成メソッドを作る。

具体例だと、マトモな国とその国の政府らしい。政府は国に1つしかなく、政府はその国のあらゆることやものを掌握することができる。

単一責任の原則を無視するので、クライアントコードのテストが難しかったり、設計の欠陥の隠蔽、コンポーネント同士が強く結びつきやすくなりカオスになりがち。

### misc

雑にSingletonパターンを実装するなら簡単で、コンストラクタを隠して（privateにして）静的生成メソッドを書くだけ。