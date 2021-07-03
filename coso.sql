create DataBase Recuparacion2
 use Recuparacion2

create table Diagnostico (
Diagnostico int primary key not null,
Descripcion char(100) not null
)

create table GrupoOcup(
GrupoOcup int primary key not null,
Descripcion char(80) not null
)

create table Departamento  (
Departamento int primary key not null,
Descripcion char(100) not null,
Jefe char(80)
)

create table Centro(
Centro int primary key not null,
Descripcion char(80) not null
)

create table Incapacidad(
Incapacidad int primary key not null,
Empleado char(80) not null,
Fecha_inicio datetime not null,
Fecha_final datetime not null,
Subsidio int not null,
Diagnistico int references Diagnostico(Diagnostico),
Sustitucion char(80) not null
)

create table Puesto(
Puesto int primary key not null,
GrupoOcup int references GrupoOcup(GrupoOcup) not null,
Descripcion char(80) not null
)

create table Establecimiento(
Establecimiento int primary key not null,
Centro int references Centro(Centro) not null,
Descripcion char(80)
)

create table Empleado(
Empleado int primary key not null,
Nombre char(80) not null,
Sexo char(15) not null,
Estado_Civil char(80) not null,
Cedula int not null,
Fecha_ingreso datetime not null,
Fecha_salida datetime not null,
Departamento int references Departamento(Departamento) not null,
Puesto int references Puesto(Puesto) not null,
Fecha_Nacimineto datetime  not null,
Direccion char(200)not null,
Telefono_1 int  not null,
Telefono_2 int not null,
Notas char(80) not null,
Establecimiento int references Establecimiento(Establecimiento) not null,
Salario int not null,
)