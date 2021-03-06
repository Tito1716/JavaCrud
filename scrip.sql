USE [Incapacidad]
GO
/****** Object:  Table [dbo].[Centro]    Script Date: 7/10/2017 13:24:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Centro](
	[id_centro] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](25) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_centro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[departamento]    Script Date: 7/10/2017 13:24:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[departamento](
	[id_departamento] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](25) NOT NULL,
	[jefe] [varchar](25) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_departamento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[diagnostico]    Script Date: 7/10/2017 13:24:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[diagnostico](
	[id_diagnostico] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](25) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_diagnostico] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[empleados]    Script Date: 7/10/2017 13:24:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[empleados](
	[id_empleado] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](25) NOT NULL,
	[sexo] [varchar](10) NOT NULL,
	[estado_civil] [varchar](10) NOT NULL,
	[fecha_ingreso] [varchar](10) NOT NULL,
	[fecha_salida] [varchar](10) NOT NULL,
	[e_departamento] [int] NOT NULL,
	[puesto] [int] NOT NULL,
	[fecha_nacimiento] [varchar](5) NOT NULL,
	[direccion] [varchar](50) NOT NULL,
	[telefono1] [varchar](10) NOT NULL,
	[telefono2] [varchar](10) NOT NULL,
	[notas] [varchar](50) NOT NULL,
	[establecimiento] [int] NOT NULL,
	[salario] [varchar](10) NOT NULL,
	[estado] [nchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_empleado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[establecimiento]    Script Date: 7/10/2017 13:24:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[establecimiento](
	[id_establecimiento] [int] IDENTITY(1,1) NOT NULL,
	[e_centro] [int] NOT NULL,
	[descripcion] [varchar](25) NOT NULL,
	[estado] [nchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_establecimiento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[grupoocup]    Script Date: 7/10/2017 13:24:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[grupoocup](
	[id_grupoocup] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](25) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_grupoocup] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[incapacidad]    Script Date: 7/10/2017 13:24:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[incapacidad](
	[id_incapacidad] [int] IDENTITY(1,1) NOT NULL,
	[i_empleado] [int] NOT NULL,
	[fecha_inicio] [varchar](10) NOT NULL,
	[fecha_final] [varchar](10) NOT NULL,
	[subsidio] [varchar](10) NOT NULL,
	[i_dignostico] [int] NOT NULL,
	[sustitucion] [varchar](25) NOT NULL,
	[estado] [nchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_incapacidad] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[puesto]    Script Date: 7/10/2017 13:24:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[puesto](
	[id_puesto] [int] IDENTITY(1,1) NOT NULL,
	[p_grupoocup] [int] NOT NULL,
	[descripcion] [varchar](25) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_puesto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Centro] ON 

INSERT [dbo].[Centro] ([id_centro], [descripcion]) VALUES (1, N'Centro1')
INSERT [dbo].[Centro] ([id_centro], [descripcion]) VALUES (2, N'Centro2')
INSERT [dbo].[Centro] ([id_centro], [descripcion]) VALUES (3, N'Centro3')
INSERT [dbo].[Centro] ([id_centro], [descripcion]) VALUES (4, N'Centro4')
INSERT [dbo].[Centro] ([id_centro], [descripcion]) VALUES (5, N'Centro5')
SET IDENTITY_INSERT [dbo].[Centro] OFF
SET IDENTITY_INSERT [dbo].[departamento] ON 

INSERT [dbo].[departamento] ([id_departamento], [descripcion], [jefe]) VALUES (1, N'departamento 1', N'jefe 1')
INSERT [dbo].[departamento] ([id_departamento], [descripcion], [jefe]) VALUES (2, N'departamento 2', N'jefe 2')
INSERT [dbo].[departamento] ([id_departamento], [descripcion], [jefe]) VALUES (3, N'departamento 3', N'jefe 3')
INSERT [dbo].[departamento] ([id_departamento], [descripcion], [jefe]) VALUES (4, N'departamento 4', N'jefe 4')
INSERT [dbo].[departamento] ([id_departamento], [descripcion], [jefe]) VALUES (5, N'departamento 5', N'jefe 5')
SET IDENTITY_INSERT [dbo].[departamento] OFF
SET IDENTITY_INSERT [dbo].[diagnostico] ON 

INSERT [dbo].[diagnostico] ([id_diagnostico], [descripcion]) VALUES (1, N'diagnostico 1')
INSERT [dbo].[diagnostico] ([id_diagnostico], [descripcion]) VALUES (2, N'diagnostico 2')
INSERT [dbo].[diagnostico] ([id_diagnostico], [descripcion]) VALUES (3, N'diagnostico 3')
INSERT [dbo].[diagnostico] ([id_diagnostico], [descripcion]) VALUES (4, N'diagnostico 4')
INSERT [dbo].[diagnostico] ([id_diagnostico], [descripcion]) VALUES (5, N'diagnostico 5')
SET IDENTITY_INSERT [dbo].[diagnostico] OFF
SET IDENTITY_INSERT [dbo].[empleados] ON 

INSERT [dbo].[empleados] ([id_empleado], [nombre], [sexo], [estado_civil], [fecha_ingreso], [fecha_salida], [e_departamento], [puesto], [fecha_nacimiento], [direccion], [telefono1], [telefono2], [notas], [establecimiento], [salario], [estado]) VALUES (3, N'ella', N'femenino', N'soltero', N'2016', N'2020', 1, 3, N'1990', N'san salvaodor', N'1233232', N'3232323', N'buenas', 4, N'500', N'1         ')
INSERT [dbo].[empleados] ([id_empleado], [nombre], [sexo], [estado_civil], [fecha_ingreso], [fecha_salida], [e_departamento], [puesto], [fecha_nacimiento], [direccion], [telefono1], [telefono2], [notas], [establecimiento], [salario], [estado]) VALUES (4, N'Erick', N'masculino', N'soltero', N'2015', N'2020', 3, 2, N'1990', N'san salvador', N'2232323', N'2323232', N'buenas', 3, N'500', N'1         ')
INSERT [dbo].[empleados] ([id_empleado], [nombre], [sexo], [estado_civil], [fecha_ingreso], [fecha_salida], [e_departamento], [puesto], [fecha_nacimiento], [direccion], [telefono1], [telefono2], [notas], [establecimiento], [salario], [estado]) VALUES (5, N'Erick', N'masculino', N'soltero', N'2015', N'2020', 1, 2, N'1990', N'san salvador', N'2232323', N'2323232', N'buenas', 3, N'500', N'2         ')
SET IDENTITY_INSERT [dbo].[empleados] OFF
SET IDENTITY_INSERT [dbo].[establecimiento] ON 

INSERT [dbo].[establecimiento] ([id_establecimiento], [e_centro], [descripcion], [estado]) VALUES (1, 1, N'establecimiento 1', N'1         ')
INSERT [dbo].[establecimiento] ([id_establecimiento], [e_centro], [descripcion], [estado]) VALUES (2, 2, N'establecimiento 2', N'1         ')
INSERT [dbo].[establecimiento] ([id_establecimiento], [e_centro], [descripcion], [estado]) VALUES (3, 3, N'establecimiento 3', N'1         ')
INSERT [dbo].[establecimiento] ([id_establecimiento], [e_centro], [descripcion], [estado]) VALUES (4, 2, N'establecimiento ', N'1         ')
INSERT [dbo].[establecimiento] ([id_establecimiento], [e_centro], [descripcion], [estado]) VALUES (5, 3, N'establecimiento 5', N'2         ')
INSERT [dbo].[establecimiento] ([id_establecimiento], [e_centro], [descripcion], [estado]) VALUES (6, 1, N'establecimiento 6', N'1         ')
INSERT [dbo].[establecimiento] ([id_establecimiento], [e_centro], [descripcion], [estado]) VALUES (7, 4, N'establecimiento 7', N'1         ')
INSERT [dbo].[establecimiento] ([id_establecimiento], [e_centro], [descripcion], [estado]) VALUES (8, 4, N'establecimiento 10', N'1         ')
SET IDENTITY_INSERT [dbo].[establecimiento] OFF
SET IDENTITY_INSERT [dbo].[grupoocup] ON 

INSERT [dbo].[grupoocup] ([id_grupoocup], [descripcion]) VALUES (1, N'grupoocup1')
INSERT [dbo].[grupoocup] ([id_grupoocup], [descripcion]) VALUES (2, N'grupoocup2')
INSERT [dbo].[grupoocup] ([id_grupoocup], [descripcion]) VALUES (3, N'grupoocup3')
INSERT [dbo].[grupoocup] ([id_grupoocup], [descripcion]) VALUES (4, N'grupoocup4')
INSERT [dbo].[grupoocup] ([id_grupoocup], [descripcion]) VALUES (5, N'grupoocup5')
SET IDENTITY_INSERT [dbo].[grupoocup] OFF
SET IDENTITY_INSERT [dbo].[incapacidad] ON 

INSERT [dbo].[incapacidad] ([id_incapacidad], [i_empleado], [fecha_inicio], [fecha_final], [subsidio], [i_dignostico], [sustitucion], [estado]) VALUES (4, 5, N'2014', N'2015', N'200', 3, N'no', N'1         ')
INSERT [dbo].[incapacidad] ([id_incapacidad], [i_empleado], [fecha_inicio], [fecha_final], [subsidio], [i_dignostico], [sustitucion], [estado]) VALUES (5, 3, N'2014', N'2015', N'200', 2, N'no disponible', N'1         ')
SET IDENTITY_INSERT [dbo].[incapacidad] OFF
SET IDENTITY_INSERT [dbo].[puesto] ON 

INSERT [dbo].[puesto] ([id_puesto], [p_grupoocup], [descripcion]) VALUES (1, 1, N'Puesto 1')
INSERT [dbo].[puesto] ([id_puesto], [p_grupoocup], [descripcion]) VALUES (2, 2, N'Puesto 2')
INSERT [dbo].[puesto] ([id_puesto], [p_grupoocup], [descripcion]) VALUES (3, 3, N'Puesto 3')
INSERT [dbo].[puesto] ([id_puesto], [p_grupoocup], [descripcion]) VALUES (4, 4, N'Puesto 4')
INSERT [dbo].[puesto] ([id_puesto], [p_grupoocup], [descripcion]) VALUES (5, 5, N'Puesto 5')
SET IDENTITY_INSERT [dbo].[puesto] OFF
ALTER TABLE [dbo].[empleados]  WITH CHECK ADD FOREIGN KEY([e_departamento])
REFERENCES [dbo].[departamento] ([id_departamento])
GO
ALTER TABLE [dbo].[empleados]  WITH CHECK ADD FOREIGN KEY([establecimiento])
REFERENCES [dbo].[establecimiento] ([id_establecimiento])
GO
ALTER TABLE [dbo].[empleados]  WITH CHECK ADD FOREIGN KEY([puesto])
REFERENCES [dbo].[puesto] ([id_puesto])
GO
ALTER TABLE [dbo].[establecimiento]  WITH CHECK ADD FOREIGN KEY([e_centro])
REFERENCES [dbo].[Centro] ([id_centro])
GO
ALTER TABLE [dbo].[incapacidad]  WITH CHECK ADD FOREIGN KEY([i_dignostico])
REFERENCES [dbo].[diagnostico] ([id_diagnostico])
GO
ALTER TABLE [dbo].[incapacidad]  WITH CHECK ADD FOREIGN KEY([i_empleado])
REFERENCES [dbo].[empleados] ([id_empleado])
GO
ALTER TABLE [dbo].[puesto]  WITH CHECK ADD FOREIGN KEY([p_grupoocup])
REFERENCES [dbo].[grupoocup] ([id_grupoocup])
GO
