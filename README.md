spark mllib lda example

官方示例较为精简

在官方lda示例的基础上，给合中文的场景作了些适配

demo性质的东西，只保证可以执行

性能，扩展，优化后续再实施

resources/docs/ 下为doc分词样例

测试

idea下执行test/Lda

wordsMap
伙伴 -> 2,箭头 -> 1,货币 -> 1,姓名 -> 2,节奏 -> 3,样品 -> 2,质量 -> 3,职业 -> 1,黏性 -> 1,城市 -> 4,协会 -> 5,正规军 -> 1,受理 -> 1,一角 -> 1,周报 -> 1,流程 -> 1,国家标准 -> 2,范围 -> 1,会议 -> 4,角色 -> 1,纠纷 -> 1,物资 -> 3,官网 -> 2,东风 -> 1,上限 -> 2,收支 -> 1,电话 -> 1,规模 -> 2,行政 -> 12,模式 -> 2,水产 -> 4,要塞 -> 1,笔记 -> 1,岗位 -> 1,全国 -> 7,几周 -> 2,员工 -> 3,官方 -> 6,年报 -> 1,旗舰 -> 1,中的 -> 1,降幅 -> 1,主营业务 -> 2,流量 -> 2,省市 -> 19,企业 -> 5,人们 -> 2,时间 -> 4,框架 -> 1,幅度 -> 3,价格 -> 4,收获 -> 1,危机 -> 1,心理 -> 3,产品 -> 11,投票权 -> 1,伤者 -> 4,进一步 -> 1,布局 -> 1,事情 -> 3,现实 -> 2,涉及 -> 1,售价 -> 1,收益率 -> 1,驻军 -> 1,边界 -> 1,二战 -> 2,传统 -> 1,科学 -> 1,成本 -> 1,社区 -> 6,瓶子 -> 1,19 -> 1,结构 -> 1,地震 -> 3,欧盟 -> 2,利率 -> 4,单位 -> 1,航空 -> 1,高炮 -> 11,当天 -> 1,性能 -> 4,要地 -> 1,逆风 -> 1,消费者 -> 2,型号 -> 1,财产 -> 2,战役 -> 1,方向 -> 1,水泥 -> 2,留言 -> 1,督促 -> 1,自身 -> 1,态度 -> 2,主动 -> 1,贷款 -> 5,直辖市 -> 2,房檐 -> 1,国家 -> 6,阶段 -> 3,地区 -> 31,关键 -> 4,行政区划 -> 2,目标 -> 1,季度 -> 1,持续 -> 1,走势 -> 1,机制 -> 2,文化 -> 3,股价 -> 9,机缘 -> 1,房价 -> 1,涨幅 -> 1,世界 -> 1,公开信 -> 1,文章 -> 1,一揽子 -> 1,住址 -> 1,基础 -> 3,区别 -> 2,地方 -> 8,界面 -> 2,通过 -> 2,差距 -> 1,监测 -> 2,门槛 -> 1,兵种 -> 1,地面 -> 1,内外部 -> 2,建筑物 -> 1,代表团 -> 3,福利社 -> 1,同比 -> 3,协议 -> 14,兵力 -> 1,种类 -> 2,科研 -> 1,资产 -> 1,速度 -> 1,中介 -> 3,价值 -> 4,人员 -> 13,战术 -> 1,债券 -> 2,水电费 -> 1,作用 -> 3,机动性 -> 1,时候 -> 4,状况 -> 2,建筑 -> 1,经济体 -> 1,前身 -> 1,版本 -> 1,自治区 -> 2,风险 -> 4,人体 -> 2,行为 -> 7,房地产 -> 6,房东 -> 2,类型 -> 1,工商 -> 7,彩票 -> 1,记者 -> 1,期限 -> 3,伤员 -> 4,数量 -> 2,底线 -> 1,推力 -> 1,链条 -> 1,纠正 -> 1,超市 -> 1,家属 -> 1,用户 -> 4,中央 -> 1,乌尔姆 -> 11,立场 -> 2,工资 -> 1,化解 -> 1,情绪 -> 2,国防军 -> 1,量级 -> 1,家族 -> 2,一传 -> 1,政策 -> 5,来源 -> 4,行业 -> 6,伙伴国 -> 1,方式 -> 4,财政 -> 36,当地人 -> 1,邮报 -> 2,网络 -> 5,歌曲 -> 1,业绩 -> 2,加强 -> 1,所属 -> 1,装备 -> 1,广场 -> 1,大关 -> 1,比例 -> 6,合作 -> 1,职能 -> 1,指数 -> 2,周期 -> 1,中国 -> 1,和平 -> 1,合同 -> 1,公关 -> 1,互联网 -> 5,债务 -> 1,美方 -> 2,进程 -> 2,股票 -> 4,全球 -> 3,跌势 -> 1,年收入 -> 1,监督 -> 1,项目 -> 2,人数 -> 3,重申 -> 1,重量 -> 2,消息 -> 11,股指 -> 1,坦克 -> 2,展台 -> 1,新闻 -> 2,热潮 -> 1,程序 -> 2,租金 -> 2,屏幕 -> 5,军需 -> 1,业务 -> 13,主导 -> 3,税收 -> 1,战场 -> 1,举报 -> 1,总收入 -> 1,利息 -> 4,女儿 -> 2,缘由 -> 1,晚会 -> 4,资金 -> 6,交易量 -> 1,外甥女 -> 1,地图 -> 1,视频 -> 2,21 -> 1,组织 -> 5,条件 -> 2,暴利 -> 1,水准 -> 1,神话 -> 2,财经 -> 6,收盘价 -> 2,比重 -> 1,外汇 -> 4,清流 -> 7,缺口 -> 1,架构 -> 4,外资 -> 1,增速 -> 2,人身 -> 2,年间 -> 2,防务 -> 1,建制 -> 3,序幕 -> 1,病房 -> 1,低调 -> 1,环境 -> 2,资料 -> 6,系统性 -> 1,领域 -> 4,资本 -> 7,出让金 -> 7,医疗 -> 2,节点 -> 1,套房 -> 1,书籍 -> 1,防范 -> 1,强势 -> 1,央行 -> 4,违规 -> 2,家属楼 -> 1,条款 -> 4,覆辙 -> 2,特区 -> 1,两地 -> 2,物流 -> 1,发挥 -> 1,实物 -> 2,会上 -> 1,监管 -> 1,份额 -> 2,后勤 -> 3,使用权 -> 2,粮仓 -> 1,人民 -> 4,今日 -> 1,内容 -> 6,说法 -> 3,商业 -> 3,经常性 -> 1,股权 -> 4,女子 -> 2,峰会 -> 1,小区 -> 2,风波 -> 2,横向 -> 1,边缘 -> 8,广告 -> 4,设备 -> 3,实际 -> 6,地位 -> 1,表格 -> 1,效应 -> 1,关系 -> 2,地域 -> 1,统计 -> 1,闭环 -> 2,产业 -> 4,净利润 -> 2,自律 -> 2,战争 -> 4,联邦 -> 2,商务 -> 1,患者 -> 1,点阵 -> 2,发布 -> 1,即日 -> 1,关税 -> 3,联军 -> 1,座谈会 -> 4,两会 -> 1,负担 -> 1,个人 -> 1,正式 -> 1,补贴 -> 1,土地 -> 53,被褥 -> 1,军事 -> 8,3月 -> 2,技术 -> 6,子女 -> 2,措施 -> 3,亲友 -> 1,持久战 -> 1,场所 -> 1,品牌 -> 3,电子 -> 10,方法 -> 2,首位 -> 1,经济 -> 22,中性 -> 1,双方 -> 9,市场 -> 42,人道主义 -> 1,相关 -> 3,面积 -> 2,预算 -> 27,渣子 -> 1,现象 -> 1,基金 -> 15,盟国 -> 1,社交 -> 3,效率 -> 1,奇迹 -> 1,概念 -> 2,事态 -> 2,机身 -> 3,弟弟 -> 2,透明度 -> 1,趋势 -> 2,真面目 -> 1,通知 -> 2,经验 -> 1,联社 -> 2,现金 -> 2,总量 -> 1,墨水 -> 2,晨报 -> 1,国债 -> 1,意识 -> 1,关键性 -> 1,关口 -> 2,整体 -> 6,规定 -> 1,问题 -> 12,资源 -> 2,汇率 -> 19,期权 -> 3,手段 -> 1,品类 -> 1,下发 -> 1,外延 -> 2,同行 -> 2,母亲河 -> 1,巅峰 -> 1,氛围 -> 1,报告 -> 1,国防 -> 1,空难 -> 1,预备役 -> 1,方面军 -> 1,平台 -> 6,条件反射 -> 1,焦点 -> 1,时期 -> 4,经历 -> 2,区域 -> 1,邻居 -> 1,阅读器 -> 2,年度 -> 2,金额 -> 5,论坛 -> 1,全面 -> 1,半数 -> 3,经营 -> 1,分辨率 -> 2,军队 -> 4,大方向 -> 1,故事 -> 1,召开 -> 1,美军 -> 1,人士 -> 7,五大 -> 1,水平 -> 4,声明 -> 1,进度 -> 1,区间 -> 4,帖子 -> 1,计划 -> 29,观点 -> 1,黑幕 -> 2,效果 -> 1,会员 -> 3,产业链 -> 1,军火库 -> 1,人口 -> 1,房屋 -> 2,职场 -> 1,系统 -> 1,股份 -> 6,人民币 -> 17,首席 -> 2,因子 -> 4,高峰 -> 1,设施 -> 1,科技 -> 68,局面 -> 1,四大 -> 1,一家 -> 3,床单 -> 1,高楼大厦 -> 1,金融 -> 3,程度 -> 8,中方 -> 6,差别 -> 2,费用 -> 1,妙招 -> 1,赤字 -> 8,机型 -> 1,中美 -> 10,普通股 -> 2,历史 -> 3,女婿 -> 2,事件 -> 2,瓷砖 -> 1,方面 -> 7,新机 -> 1,排查 -> 1,大国 -> 1,观感 -> 1,媒体 -> 4,部门 -> 7,谜团 -> 1,公告 -> 13,重地 -> 1,核心 -> 1,欠款 -> 1,启事 -> 1,国都 -> 1,战斗力 -> 1,信号 -> 2,热度 -> 1,事故 -> 1,迹象 -> 1,一战 -> 1,多方面 -> 1,要求 -> 6,综合征 -> 1,状态 -> 2,部分 -> 4,房子 -> 7,信息 -> 6,手术 -> 1,地理 -> 1,总体 -> 2,专题 -> 2,原因 -> 8,公众 -> 1,坦克师 -> 1,女孩 -> 1,攻势 -> 1,事宜 -> 1,目的 -> 3,大部分 -> 1,进口商品 -> 2,级别 -> 5,房间 -> 1,商品 -> 14,行情 -> 3,拿破仑 -> 1,能力 -> 2,情况 -> 11,地缘 -> 1,听证会 -> 1,包装 -> 2,强国 -> 1,竞争性 -> 3,任务 -> 4,现状 -> 1,箱子 -> 1,三无 -> 1,新品 -> 3,草案 -> 4,道路 -> 1,俄军 -> 1,中央军 -> 1,开展 -> 2,增幅 -> 5,兵营 -> 1,协定 -> 2,高息 -> 2,形势 -> 2,组别 -> 1,决议 -> 1,收入 -> 39,引流 -> 1,股东 -> 12,动力 -> 1,真格 -> 1,实力 -> 1,财务 -> 2,下肢 -> 1,下图 -> 1,网站 -> 5,本金 -> 1,日报 -> 3,数据 -> 5,省份 -> 4,大笔 -> 1,专长 -> 1,损益 -> 1,地价 -> 1,病情 -> 2,巨头 -> 1,全资 -> 1,管理 -> 1,山体 -> 3,标准 -> 8,姜樊 -> 1,图片 -> 1,人才 -> 2,力度 -> 1,方桌 -> 1,重要性 -> 1,步兵师 -> 3,职位 -> 1,局势 -> 1,出资额 -> 1,重镇 -> 1,机构 -> 14,假设 -> 1,优势 -> 1,比值 -> 7,身影 -> 2,高位 -> 1,共识 -> 1,对方 -> 1,口子 -> 1,想法 -> 1,战略 -> 4
wordIndex
伙伴 -> 0,箭头 -> 1,货币 -> 2,姓名 -> 3,节奏 -> 4,样品 -> 5,质量 -> 6,职业 -> 7,黏性 -> 8,城市 -> 9,协会 -> 10,正规军 -> 11,受理 -> 12,一角 -> 13,周报 -> 14,流程 -> 15,国家标准 -> 16,范围 -> 17,会议 -> 18,角色 -> 19,纠纷 -> 20,物资 -> 21,官网 -> 22,东风 -> 23,上限 -> 24,收支 -> 25,电话 -> 26,规模 -> 27,行政 -> 28,模式 -> 29,水产 -> 30,要塞 -> 31,笔记 -> 32,岗位 -> 33,全国 -> 34,几周 -> 35,员工 -> 36,官方 -> 37,年报 -> 38,旗舰 -> 39,中的 -> 40,降幅 -> 41,主营业务 -> 42,流量 -> 43,省市 -> 44,企业 -> 45,人们 -> 46,时间 -> 47,框架 -> 48,幅度 -> 49,价格 -> 50,收获 -> 51,危机 -> 52,心理 -> 53,产品 -> 54,投票权 -> 55,伤者 -> 56,进一步 -> 57,布局 -> 58,事情 -> 59,现实 -> 60,涉及 -> 61,售价 -> 62,收益率 -> 63,驻军 -> 64,边界 -> 65,二战 -> 66,传统 -> 67,科学 -> 68,成本 -> 69,社区 -> 70,瓶子 -> 71,19 -> 72,结构 -> 73,地震 -> 74,欧盟 -> 75,利率 -> 76,单位 -> 77,航空 -> 78,高炮 -> 79,当天 -> 80,性能 -> 81,要地 -> 82,逆风 -> 83,消费者 -> 84,型号 -> 85,财产 -> 86,战役 -> 87,方向 -> 88,水泥 -> 89,留言 -> 90,督促 -> 91,自身 -> 92,态度 -> 93,主动 -> 94,贷款 -> 95,直辖市 -> 96,房檐 -> 97,国家 -> 98,阶段 -> 99,地区 -> 100,关键 -> 101,行政区划 -> 102,目标 -> 103,季度 -> 104,持续 -> 105,走势 -> 106,机制 -> 107,文化 -> 108,股价 -> 109,机缘 -> 110,房价 -> 111,涨幅 -> 112,世界 -> 113,公开信 -> 114,文章 -> 115,一揽子 -> 116,住址 -> 117,基础 -> 118,区别 -> 119,地方 -> 120,界面 -> 121,通过 -> 122,差距 -> 123,监测 -> 124,门槛 -> 125,兵种 -> 126,地面 -> 127,内外部 -> 128,建筑物 -> 129,代表团 -> 130,福利社 -> 131,同比 -> 132,协议 -> 133,兵力 -> 134,种类 -> 135,科研 -> 136,资产 -> 137,速度 -> 138,中介 -> 139,价值 -> 140,人员 -> 141,战术 -> 142,债券 -> 143,水电费 -> 144,作用 -> 145,机动性 -> 146,时候 -> 147,状况 -> 148,建筑 -> 149,经济体 -> 150,前身 -> 151,版本 -> 152,自治区 -> 153,风险 -> 154,人体 -> 155,行为 -> 156,房地产 -> 157,房东 -> 158,类型 -> 159,工商 -> 160,彩票 -> 161,记者 -> 162,期限 -> 163,伤员 -> 164,数量 -> 165,底线 -> 166,推力 -> 167,链条 -> 168,纠正 -> 169,超市 -> 170,家属 -> 171,用户 -> 172,中央 -> 173,乌尔姆 -> 174,立场 -> 175,工资 -> 176,化解 -> 177,情绪 -> 178,国防军 -> 179,量级 -> 180,家族 -> 181,一传 -> 182,政策 -> 183,来源 -> 184,行业 -> 185,伙伴国 -> 186,方式 -> 187,财政 -> 188,当地人 -> 189,邮报 -> 190,网络 -> 191,歌曲 -> 192,业绩 -> 193,加强 -> 194,所属 -> 195,装备 -> 196,广场 -> 197,大关 -> 198,比例 -> 199,合作 -> 200,职能 -> 201,指数 -> 202,周期 -> 203,中国 -> 204,和平 -> 205,合同 -> 206,公关 -> 207,互联网 -> 208,债务 -> 209,美方 -> 210,进程 -> 211,股票 -> 212,全球 -> 213,跌势 -> 214,年收入 -> 215,监督 -> 216,项目 -> 217,人数 -> 218,重申 -> 219,重量 -> 220,消息 -> 221,股指 -> 222,坦克 -> 223,展台 -> 224,新闻 -> 225,热潮 -> 226,程序 -> 227,租金 -> 228,屏幕 -> 229,军需 -> 230,业务 -> 231,主导 -> 232,税收 -> 233,战场 -> 234,举报 -> 235,总收入 -> 236,利息 -> 237,女儿 -> 238,缘由 -> 239,晚会 -> 240,资金 -> 241,交易量 -> 242,外甥女 -> 243,地图 -> 244,视频 -> 245,21 -> 246,组织 -> 247,条件 -> 248,暴利 -> 249,水准 -> 250,神话 -> 251,财经 -> 252,收盘价 -> 253,比重 -> 254,外汇 -> 255,清流 -> 256,缺口 -> 257,架构 -> 258,外资 -> 259,增速 -> 260,人身 -> 261,年间 -> 262,防务 -> 263,建制 -> 264,序幕 -> 265,病房 -> 266,低调 -> 267,环境 -> 268,资料 -> 269,系统性 -> 270,领域 -> 271,资本 -> 272,出让金 -> 273,医疗 -> 274,节点 -> 275,套房 -> 276,书籍 -> 277,防范 -> 278,强势 -> 279,央行 -> 280,违规 -> 281,家属楼 -> 282,条款 -> 283,覆辙 -> 284,特区 -> 285,两地 -> 286,物流 -> 287,发挥 -> 288,实物 -> 289,会上 -> 290,监管 -> 291,份额 -> 292,后勤 -> 293,使用权 -> 294,粮仓 -> 295,人民 -> 296,今日 -> 297,内容 -> 298,说法 -> 299,商业 -> 300,经常性 -> 301,股权 -> 302,女子 -> 303,峰会 -> 304,小区 -> 305,风波 -> 306,横向 -> 307,边缘 -> 308,广告 -> 309,设备 -> 310,实际 -> 311,地位 -> 312,表格 -> 313,效应 -> 314,关系 -> 315,地域 -> 316,统计 -> 317,闭环 -> 318,产业 -> 319,净利润 -> 320,自律 -> 321,战争 -> 322,联邦 -> 323,商务 -> 324,患者 -> 325,点阵 -> 326,发布 -> 327,即日 -> 328,关税 -> 329,联军 -> 330,座谈会 -> 331,两会 -> 332,负担 -> 333,个人 -> 334,正式 -> 335,补贴 -> 336,土地 -> 337,被褥 -> 338,军事 -> 339,3月 -> 340,技术 -> 341,子女 -> 342,措施 -> 343,亲友 -> 344,持久战 -> 345,场所 -> 346,品牌 -> 347,电子 -> 348,方法 -> 349,首位 -> 350,经济 -> 351,中性 -> 352,双方 -> 353,市场 -> 354,人道主义 -> 355,相关 -> 356,面积 -> 357,预算 -> 358,渣子 -> 359,现象 -> 360,基金 -> 361,盟国 -> 362,社交 -> 363,效率 -> 364,奇迹 -> 365,概念 -> 366,事态 -> 367,机身 -> 368,弟弟 -> 369,透明度 -> 370,趋势 -> 371,真面目 -> 372,通知 -> 373,经验 -> 374,联社 -> 375,现金 -> 376,总量 -> 377,墨水 -> 378,晨报 -> 379,国债 -> 380,意识 -> 381,关键性 -> 382,关口 -> 383,整体 -> 384,规定 -> 385,问题 -> 386,资源 -> 387,汇率 -> 388,期权 -> 389,手段 -> 390,品类 -> 391,下发 -> 392,外延 -> 393,同行 -> 394,母亲河 -> 395,巅峰 -> 396,氛围 -> 397,报告 -> 398,国防 -> 399,空难 -> 400,预备役 -> 401,方面军 -> 402,平台 -> 403,条件反射 -> 404,焦点 -> 405,时期 -> 406,经历 -> 407,区域 -> 408,邻居 -> 409,阅读器 -> 410,年度 -> 411,金额 -> 412,论坛 -> 413,全面 -> 414,半数 -> 415,经营 -> 416,分辨率 -> 417,军队 -> 418,大方向 -> 419,故事 -> 420,召开 -> 421,美军 -> 422,人士 -> 423,五大 -> 424,水平 -> 425,声明 -> 426,进度 -> 427,区间 -> 428,帖子 -> 429,计划 -> 430,观点 -> 431,黑幕 -> 432,效果 -> 433,会员 -> 434,产业链 -> 435,军火库 -> 436,人口 -> 437,房屋 -> 438,职场 -> 439,系统 -> 440,股份 -> 441,人民币 -> 442,首席 -> 443,因子 -> 444,高峰 -> 445,设施 -> 446,科技 -> 447,局面 -> 448,四大 -> 449,一家 -> 450,床单 -> 451,高楼大厦 -> 452,金融 -> 453,程度 -> 454,中方 -> 455,差别 -> 456,费用 -> 457,妙招 -> 458,赤字 -> 459,机型 -> 460,中美 -> 461,普通股 -> 462,历史 -> 463,女婿 -> 464,事件 -> 465,瓷砖 -> 466,方面 -> 467,新机 -> 468,排查 -> 469,大国 -> 470,观感 -> 471,媒体 -> 472,部门 -> 473,谜团 -> 474,公告 -> 475,重地 -> 476,核心 -> 477,欠款 -> 478,启事 -> 479,国都 -> 480,战斗力 -> 481,信号 -> 482,热度 -> 483,事故 -> 484,迹象 -> 485,一战 -> 486,多方面 -> 487,要求 -> 488,综合征 -> 489,状态 -> 490,部分 -> 491,房子 -> 492,信息 -> 493,手术 -> 494,地理 -> 495,总体 -> 496,专题 -> 497,原因 -> 498,公众 -> 499,坦克师 -> 500,女孩 -> 501,攻势 -> 502,事宜 -> 503,目的 -> 504,大部分 -> 505,进口商品 -> 506,级别 -> 507,房间 -> 508,商品 -> 509,行情 -> 510,拿破仑 -> 511,能力 -> 512,情况 -> 513,地缘 -> 514,听证会 -> 515,包装 -> 516,强国 -> 517,竞争性 -> 518,任务 -> 519,现状 -> 520,箱子 -> 521,三无 -> 522,新品 -> 523,草案 -> 524,道路 -> 525,俄军 -> 526,中央军 -> 527,开展 -> 528,增幅 -> 529,兵营 -> 530,协定 -> 531,高息 -> 532,形势 -> 533,组别 -> 534,决议 -> 535,收入 -> 536,引流 -> 537,股东 -> 538,动力 -> 539,真格 -> 540,实力 -> 541,财务 -> 542,下肢 -> 543,下图 -> 544,网站 -> 545,本金 -> 546,日报 -> 547,数据 -> 548,省份 -> 549,大笔 -> 550,专长 -> 551,损益 -> 552,地价 -> 553,病情 -> 554,巨头 -> 555,全资 -> 556,管理 -> 557,山体 -> 558,标准 -> 559,姜樊 -> 560,图片 -> 561,人才 -> 562,力度 -> 563,方桌 -> 564,重要性 -> 565,步兵师 -> 566,职位 -> 567,局势 -> 568,出资额 -> 569,重镇 -> 570,机构 -> 571,假设 -> 572,优势 -> 573,比值 -> 574,身影 -> 575,高位 -> 576,共识 -> 577,对方 -> 578,口子 -> 579,想法 -> 580,战略 -> 581
indexWord
69 -> 成本,365 -> 奇迹,138 -> 速度,101 -> 关键,479 -> 启事,347 -> 品牌,333 -> 负担,249 -> 暴利,518 -> 竞争性,468 -> 新机,234 -> 战场,0 -> 伙伴,555 -> 巨头,88 -> 方向,481 -> 战斗力,352 -> 中性,408 -> 区域,170 -> 超市,523 -> 新品,115 -> 文章,217 -> 项目,276 -> 套房,308 -> 边缘,5 -> 样品,449 -> 四大,120 -> 地方,247 -> 组织,379 -> 晨报,440 -> 系统,511 -> 拿破仑,269 -> 资料,202 -> 指数,10 -> 协会,385 -> 规定,384 -> 整体,56 -> 伤者,533 -> 形势,550 -> 大笔,142 -> 战术,500 -> 坦克师,472 -> 媒体,340 -> 3月,538 -> 股东,153 -> 自治区,174 -> 乌尔姆,404 -> 条件反射,185 -> 行业,42 -> 主营业务,417 -> 分辨率,24 -> 上限,288 -> 发挥,301 -> 经常性,320 -> 净利润,565 -> 重要性,436 -> 军火库,37 -> 官方,25 -> 收支,257 -> 缺口,389 -> 期权,52 -> 危机,14 -> 周报,570 -> 重镇,184 -> 来源,372 -> 真面目,504 -> 目的,110 -> 机缘,125 -> 门槛,344 -> 亲友,357 -> 面积,196 -> 装备,542 -> 财务,460 -> 机型,157 -> 房地产,559 -> 标准,189 -> 当地人,20 -> 纠纷,421 -> 召开,46 -> 人们,93 -> 态度,284 -> 覆辙,416 -> 经营,325 -> 患者,152 -> 版本,228 -> 租金,289 -> 实物,448 -> 局面,57 -> 进一步,316 -> 地域,78 -> 航空,261 -> 人身,29 -> 模式,216 -> 监督,475 -> 公告,492 -> 房子,164 -> 伤员,179 -> 国防军,443 -> 首席,321 -> 自律,376 -> 现金,211 -> 进程,253 -> 收盘价,485 -> 迹象,106 -> 走势,238 -> 女儿,121 -> 界面,514 -> 地缘,348 -> 电子,574 -> 比值,84 -> 消费者,353 -> 双方,480 -> 国都,147 -> 时候,397 -> 氛围,280 -> 央行,61 -> 涉及,221 -> 消息,293 -> 后勤,453 -> 金融,132 -> 同比,396 -> 巅峰,89 -> 水泥,133 -> 协议,411 -> 年度,116 -> 一揽子,243 -> 外甥女,428 -> 区间,1 -> 箭头,265 -> 序幕,507 -> 级别,527 -> 中央军,312 -> 地位,74 -> 地震,206 -> 合同,307 -> 横向,292 -> 份额,233 -> 税收,452 -> 高楼大厦,6 -> 质量,248 -> 条件,60 -> 现实,380 -> 国债,117 -> 住址,512 -> 能力,439 -> 职场,270 -> 系统性,529 -> 增幅,546 -> 本金,85 -> 型号,201 -> 职能,381 -> 意识,220 -> 重量,366 -> 概念,534 -> 组别,102 -> 行政区划,334 -> 个人,302 -> 股权,260 -> 增速,349 -> 方法,28 -> 行政,38 -> 年报,160 -> 工商,561 -> 图片,392 -> 下发,297 -> 今日,70 -> 社区,424 -> 五大,192 -> 歌曲,407 -> 经历,429 -> 帖子,275 -> 节点,21 -> 物资,137 -> 资产,165 -> 数量,33 -> 岗位,92 -> 自身,467 -> 方面,229 -> 屏幕,566 -> 步兵师,484 -> 事故,252 -> 财经,197 -> 广场,361 -> 基金,65 -> 边界,435 -> 产业链,97 -> 房檐,329 -> 关税,522 -> 三无,461 -> 中美,493 -> 信息,551 -> 专长,456 -> 差别,324 -> 商务,285 -> 特区,224 -> 展台,519 -> 任务,578 -> 对方,317 -> 统计,156 -> 行为,403 -> 平台,9 -> 城市,188 -> 财政,388 -> 汇率,53 -> 心理,356 -> 相关,169 -> 纠正,141 -> 人员,420 -> 故事,499 -> 公众,109 -> 股价,328 -> 即日,471 -> 观感,256 -> 清流,488 -> 要求,124 -> 监测,225 -> 新闻,339 -> 军事,77 -> 单位,554 -> 病情,193 -> 业绩,537 -> 引流,476 -> 重地,526 -> 俄军,489 -> 综合征,547 -> 日报,212 -> 股票,96 -> 直辖市,393 -> 外延,515 -> 听证会,457 -> 费用,173 -> 中央,13 -> 一角,129 -> 建筑物,569 -> 出资额,41 -> 降幅,371 -> 趋势,503 -> 事宜,134 -> 兵力,73 -> 结构,128 -> 内外部,343 -> 措施,237 -> 利息,105 -> 持续,244 -> 地图,2 -> 货币,266 -> 病房,360 -> 现象,205 -> 和平,508 -> 房间,311 -> 实际,541 -> 实力,398 -> 报告,558 -> 山体,530 -> 兵营,298 -> 内容,412 -> 金额,425 -> 水平,513 -> 情况,430 -> 计划,166 -> 底线,32 -> 笔记,34 -> 全国,148 -> 状况,264 -> 建制,45 -> 企业,161 -> 彩票,279 -> 强势,64 -> 驻军,573 -> 优势,180 -> 量级,296 -> 人民,17 -> 范围,444 -> 因子,149 -> 建筑,375 -> 联社,562 -> 人才,176 -> 工资,423 -> 人士,191 -> 网络,402 -> 方面军,22 -> 官网,44 -> 省市,286 -> 两地,577 -> 共识,579 -> 口子,291 -> 监管,59 -> 事情,118 -> 基础,281 -> 违规,204 -> 中国,545 -> 网站,259 -> 外资,27 -> 规模,413 -> 论坛,71 -> 瓶子,391 -> 品类,12 -> 受理,445 -> 高峰,382 -> 关键性,54 -> 产品,572 -> 假设,313 -> 表格,144 -> 水电费,498 -> 原因,49 -> 幅度,466 -> 瓷砖,335 -> 正式,236 -> 总收入,181 -> 家族,350 -> 首位,540 -> 真格,86 -> 财产,159 -> 类型,187 -> 方式,406 -> 时期,172 -> 用户,113 -> 世界,219 -> 重申,274 -> 医疗,419 -> 大方向,81 -> 性能,377 -> 总量,230 -> 军需,362 -> 盟国,451 -> 床单,76 -> 利率,567 -> 职位,7 -> 职业,245 -> 视频,318 -> 闭环,509 -> 商品,39 -> 旗舰,434 -> 会员,98 -> 国家,303 -> 女子,271 -> 领域,208 -> 互联网,477 -> 核心,387 -> 资源,494 -> 手术,345 -> 持久战,367 -> 事态,552 -> 损益,535 -> 决议,103 -> 目标,323 -> 联邦,140 -> 价值,213 -> 全球,91 -> 督促,483 -> 热度,520 -> 现状,66 -> 二战,240 -> 晚会,251 -> 神话,155 -> 人体,198 -> 大关,108 -> 文化,330 -> 联军,462 -> 普通股,521 -> 箱子,130 -> 代表团,399 -> 国防,278 -> 防范,455 -> 中方,223 -> 坦克,394 -> 同行,306 -> 风波,135 -> 种类,563 -> 力度,299 -> 说法,226 -> 热潮,3 -> 姓名,267 -> 低调,505 -> 大部分,438 -> 房屋,431 -> 观点,241 -> 资金,80 -> 当天,167 -> 推力,35 -> 几周,473 -> 部门,490 -> 状态,426 -> 声明,162 -> 记者,531 -> 协定,548 -> 数据,374 -> 经验,255 -> 外汇,209 -> 债务,487 -> 多方面,112 -> 涨幅,516 -> 包装,342 -> 子女,123 -> 差距,355 -> 人道主义,553 -> 地价,458 -> 妙招,194 -> 加强,145 -> 作用,48 -> 框架,525 -> 道路,557 -> 管理,580 -> 想法,63 -> 收益率,295 -> 粮仓,18 -> 会议,282 -> 家属楼,150 -> 经济体,414 -> 全面,95 -> 贷款,327 -> 发布,409 -> 邻居,263 -> 防务,310 -> 设备,50 -> 价格,67 -> 传统,199 -> 比例,177 -> 化解,182 -> 一传,331 -> 座谈会,441 -> 股份,16 -> 国家标准,370 -> 透明度,502 -> 攻势,463 -> 历史,127 -> 地面,338 -> 被褥,470 -> 大国,576 -> 高位,359 -> 渣子,544 -> 下图,31 -> 要塞,336 -> 补贴,154 -> 风险,11 -> 正规军,72 -> 19,175 -> 立场,386 -> 问题,314 -> 效应,446 -> 设施,571 -> 机构,143 -> 债券,497 -> 专题,43 -> 流量,250 -> 水准,465 -> 事件,231 -> 业务,450 -> 一家,99 -> 阶段,363 -> 社交,556 -> 全资,539 -> 动力,87 -> 战役,482 -> 信号,203 -> 周期,524 -> 草案,581 -> 战略,495 -> 地理,218 -> 人数,104 -> 季度,368 -> 机身,517 -> 强国,319 -> 产业,40 -> 中的,304 -> 峰会,26 -> 电话,258 -> 架构,158 -> 房东,351 -> 经济,390 -> 手段,186 -> 伙伴国,55 -> 投票权,114 -> 公开信,401 -> 预备役,171 -> 家属,139 -> 中介,418 -> 军队,23 -> 东风,8 -> 黏性,75 -> 欧盟,568 -> 局势,290 -> 会上,119 -> 区别,58 -> 布局,378 -> 墨水,235 -> 举报,246 -> 21,433 -> 效果,510 -> 行情,207 -> 公关,478 -> 欠款,272 -> 资本,383 -> 关口,346 -> 场所,549 -> 省份,536 -> 收入,82 -> 要地,214 -> 跌势,287 -> 物流,151 -> 前身,300 -> 商业,447 -> 科技,315 -> 关系,432 -> 黑幕,410 -> 阅读器,36 -> 员工,168 -> 链条,262 -> 年间,146 -> 机动性,30 -> 水产,51 -> 收获,405 -> 焦点,190 -> 邮报,183 -> 政策,19 -> 角色,422 -> 美军,273 -> 出让金,373 -> 通知,564 -> 方桌,305 -> 小区,210 -> 美方,326 -> 点阵,107 -> 机制,239 -> 缘由,242 -> 交易量,4 -> 节奏,294 -> 使用权,126 -> 兵种,136 -> 科研,341 -> 技术,506 -> 进口商品,268 -> 环境,358 -> 预算,79 -> 高炮,195 -> 所属,437 -> 人口,474 -> 谜团,400 -> 空难,532 -> 高息,94 -> 主动,283 -> 条款,415 -> 半数,395 -> 母亲河,464 -> 女婿,332 -> 两会,575 -> 身影,427 -> 进度,528 -> 开展,459 -> 赤字,131 -> 福利社,47 -> 时间,15 -> 流程,163 -> 期限,200 -> 合作,68 -> 科学,62 -> 售价,178 -> 情绪,277 -> 书籍,442 -> 人民币,501 -> 女孩,369 -> 弟弟,90 -> 留言,111 -> 房价,254 -> 比重,227 -> 程序,322 -> 战争,486 -> 一战,337 -> 土地,122 -> 通过,469 -> 排查,354 -> 市场,83 -> 逆风,309 -> 广告,543 -> 下肢,215 -> 年收入,560 -> 姜樊,491 -> 部分,222 -> 股指,496 -> 总体,454 -> 程度,364 -> 效率,232 -> 主导,100 -> 地区


 topics:
TOPIC 0
价格	0.018525936485612692
事情	0.01670382847833859
欧盟	0.016120663804188275
单位	0.01418523392797106
瓶子	0.013545371306725461
布局	0.013354261009705316
产品	0.013303605642554334
驻军	0.013174276071864718
售价	0.013059267781342178
19	0.012882762375803007

TOPIC 1
数量	0.006997463864521414
网络	0.006790328159932679
建筑	0.006533172549669045
超市	0.006519423963688325
记者	0.006271353803817254
行为	0.0059561659976806415
门槛	0.005746488581070096
房地产	0.005711938103557209
工商	0.0056645081954015694
彩票	0.00556825815376125

TOPIC 2
周报	0.03181287454775734
范围	0.030336204447315527
姓名	0.02597876032141369
官网	0.025916833167263464
受理	0.02548380853205731
正规军	0.025127315227415136
职业	0.02379256705626642
旗舰	0.023419884415171396
角色	0.02329744859607057
上限	0.02285045158162983